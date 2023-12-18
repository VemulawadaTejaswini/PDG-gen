import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			List<Jewel> jewel=new ArrayList<Jewel>(); 
			int n=sc.nextInt();
			if(n==0)break;
			for(int i=0;i<n;i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				jewel.add(new Jewel(x,y));
			}	
			int x=10,y=10;
			n=sc.nextInt();
			for(int j=0;j<jewel.size();j++)
				if(jewel.get(j).pick(x,y))
					jewel.remove(j--);
			for(int k=0;k<n;k++){
				String way=sc.next();
				int m=sc.nextInt();
				for(int i=0;i<m;i++){
					if(way.equals("N"))
						y++;
					else if(way.equals("E"))
						x++;
					else if(way.equals("S"))
						y--;
					else if(way.equals("N"))
						x--;

					for(int j=0;j<jewel.size();j++)
						if(jewel.get(j).pick(x,y))
							jewel.remove(j--);
				}
				
			}
			System.out.println(jewel.size()==0?"Yes":"No");
		}
	}
}

class Jewel{
	int x,y;
	Jewel(int x,int y){
		this.x=x;
		this.y=y;
	}

	boolean pick(int x,int y){
		return (this.x==x&&this.y==y);
	}
}