import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0502();
	}

	class AOJ0502{
		public AOJ0502() {
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				Dice dice = new Dice(1, 2);
				int sum = 1;
				for(int i=0;i<n;i++){
					String input = in.next();
					if(input.equals("North"))dice.rotateNorth();
					else if(input.equals("East"))dice.rotateEast();
					else if(input.equals("West"))dice.rotateWest();
					else if(input.equals("South"))dice.rotateSouth();
					else if(input.equals("Right"))dice.rotateCW();
					else if(input.equals("Left"))dice.rotateCCW();
//					System.out.println(dice.getTop());
					sum+=dice.getTop();
				}
				System.out.println(sum);
			}
		}

		class Dice{
			private int top=1,bottom=6,east=5,west=2,north=4,south=3;
			public Dice(int t,int s) {
				switch(t){
				case 1: break;
				case 2: rotateEast(); break;
				case 3: rotateNorth(); break;
				case 4: rotateSouth(); break;
				case 5: rotateWest(); break;
				case 6: reverse(); break;
				}
				while(s!=south) rotateCW();
			}
			boolean IsDice(){
				return north+south==7&&top+bottom==7&&west+east==7;
			}
			Dice rotateEast(){
				int temp=east;east=top;top=west;west=bottom;bottom=temp;
				return this;
			}
			Dice rotateWest(){
				int tmp=west; west=top; top=east; east=bottom; bottom=tmp;
				return this;
			}
			Dice rotateSouth(){
				int tmp=south; south=top; top=north; north=bottom; bottom=tmp;
				return this;
			}
			Dice rotateNorth(){
				int tmp=north; north=top; top=south; south=bottom; bottom=tmp;
				return this;
			}
			Dice reverse(){
				rotateNorth(); rotateNorth(); rotateCW(); rotateCW();
				return this;
			}
			Dice rotateCW(){//時計回り
				int tmp=north; north=west; west=south; south=east; east=tmp;
				return this;
			}
			Dice rotateCCW(){//反時計回り
				int tmp=north; north=east; east=south; south=west; west=tmp;
				return this;
			}
			int getTop(){
				return top;
			}
			int getBottom(){
				return bottom;
			}
			int getEast(){
				return east;
			}
			int getWest(){
				return west;
			}
			int getSourth(){
				return south;
			}
			int getNorth(){
				return north;
			}
			@Override public String toString(){
				return "top"+top+" north"+north+" east"+east+" south"+south+" west"+west+" bottom"+bottom;
			}
			@Override public boolean equals(Object obj){
				if(obj==this)return true;
				if(!(obj instanceof Dice))return false;
				Dice d = (Dice)obj;
				if(this.top==d.getTop()&&this.bottom==d.getBottom()&&
						this.east==d.getWest()&&this.west==d.getWest()&&
						this.north==d.getNorth()&&this.south==d.getSourth())return true;
				return false;
			}
		}
	}

	class AOJ0119{
		HashMap<Integer, ArrayList<Integer>> map;
		HashMap<Integer, ArrayList<Integer>> map2;
		boolean sw[];
		boolean flg;
		int m,n;
		ArrayList<Integer> result;
		void dfs(int person,int cnt){
			if(cnt==m){
				if(map2.get(person).size()!=0)return;
				flg=true;
				return;
			}
			if(flg)return;
			ArrayList<Integer> get_list = map2.get(person);
			for(int i=0;i<get_list.size();i++)if(!sw[get_list.get(i)]){
				sw[get_list.get(i)]=true;
				result.add(get_list.get(i));
				dfs(get_list.get(i),cnt+1);
				if(flg)return;
				result.remove(result.size()-1);
				sw[get_list.get(i)]=false;
			}
			if(map2.get(person).size()!=0)return;
			for(int key:map2.keySet())if(!sw[key]){
				sw[key] = true;
				result.add(key);
				dfs(key,cnt+1);
				if(flg)return;
				result.remove(result.size()-1);
				sw[key]=false;
			}
		}

		public AOJ0119() {
			map = new HashMap<Integer, ArrayList<Integer>>();
			map2 = new HashMap<Integer, ArrayList<Integer>>();
			m = in.nextInt();//容疑者数
			n = in.nextInt();//証言数
			sw = new boolean[m+1];
			result = new ArrayList<Integer>();
			for(int i=1;i<=m;i++){
				map.put(i, new ArrayList<Integer>());
				map2.put(i,new ArrayList<Integer>());
			}
			for(int i=0;i<n;i++){
				int x = in.nextInt();
				int y = in.nextInt();
				ArrayList<Integer> a = map.remove(x);a.add(y);
				map.put(x,a);
			}
			//			System.out.println(map);//deba
			for(int i=1;i<=m;i++){
				for(int s=1;s<=m;s++)if(map.get(s).contains(i)){
					ArrayList<Integer> a = map2.remove(i);a.add(s);
					map2.put(i,a);
				}
			}
			//			System.out.println(map2);//deba
			flg = false;sw[2]=true;result.add(2);
			dfs(2,1);
			for(int i=result.size()-1;i>=0;i--)System.out.println(result.get(i));
		}
	}

}