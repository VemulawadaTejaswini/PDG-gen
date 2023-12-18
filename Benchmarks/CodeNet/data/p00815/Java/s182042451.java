import java.util.*;
public class Main {
	//0140 start
	//0200 end
	//0430 restart
	//0442 sample match WA
	//0509 WA * 2
	
	class C{
		int count, rest;
		ArrayList<Integer> list;
		public C(int count, int rest) {
			this.count = count;
			this.rest = rest;
			this.list = new ArrayList<Integer>();
		}
		
		private void sort(){
			Collections.sort(this.list);
		}

		@Override
		public String toString() {
			return "C [count=" + count + ", rest=" + rest + ", list=" + list.toString()
					+ "]";
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			ArrayList<Integer> input = new ArrayList<Integer>();
			int inputnum = sc.nextInt();
			while(inputnum != 0){
				input.add(inputnum);
				inputnum = sc.nextInt();
			}
			
			ArrayList<C> rooms = new ArrayList<C>();
			int first = input.get(0);
			int nowroom = 0;
			rooms.add(new C(0, first));
			for(int i = 1; i < input.size(); i++){
				int nownum = input.get(i);
				if(nownum < 0){
					//nownumのcount を探す
					int find = rooms.get(nowroom).count + nownum;
					for(int j = nowroom - 1; j >= 0; j--){
						if(rooms.get(j).count == find){
							//つなげる
							rooms.get(nowroom).rest--;
							rooms.get(nowroom).list.add(j + 1);
							
							//反対側
							rooms.get(j).rest--;
							rooms.get(j).list.add(nowroom + 1);
							break;
						}
					}
					
					//次のnowroomを探す
					for(int j = nowroom; j >= 0; j--){
						if(rooms.get(j).rest > 0){
							nowroom = j;
							break;
						}
					}
					
				}
				else{
					int nextcount = rooms.get(nowroom).count + 1;
					rooms.add(new C(nextcount, nownum));
					int nextroomid = rooms.size() - 1;
					
					//つなげる
					rooms.get(nowroom).rest--;
					rooms.get(nowroom).list.add(nextroomid + 1);
					
					//反対側
					rooms.get(nextroomid).rest--;
					rooms.get(nextroomid).list.add(nowroom + 1);
					
					nowroom = nextroomid;
				}
			}
			
			for(int i = 0; i < rooms.size();i++){
				int rest = rooms.get(i).rest;
				if(rest > 0 && rest % 2 == 0){
					for(int j = 0; j < rest / 2; j++){
						rooms.get(i).list.add(i + 1);
					}
				}
			}
			
			for(int i = 0; i < rooms.size(); i++){
				rooms.get(i).sort();
			}
			
			//print
			for(int i = 0; i < rooms.size(); i++){
				System.out.print((i + 1));
				for(int j = 0; j < rooms.get(i).list.size(); j++){
					System.out.print(" " + rooms.get(i).list.get(j));
				}
				System.out.println();
			}
			
			//debug
//			System.out.println("debug = ");
//			for(int i = 0; i < rooms.size(); i++){
//				System.out.println(rooms.get(i));
//			}
		}
	}
	public static void main(String [] args){
		new Main().doit();
	}
}