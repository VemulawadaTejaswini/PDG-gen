import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ2012().doIt();
	}
	
	class AOJ2012{
		
		int v;
		int calc(){
			int result = Integer.MAX_VALUE;
			for(int z=100;z>=0;z--)if(z*z*z<=v){
				for(int y=1000;y>=0;y--){
					if(z*z*z+y*y>v)continue;
					int x = v-(z*z*z+y*y);
					result = Math.min(result, x+y+z);
				}
			}
			return result;
		}
		void doIt(){
			while(in.hasNext()){
				v = in.nextInt();
				if(v==0)break;
				System.out.println(calc());
			}
		}
	}
	
}