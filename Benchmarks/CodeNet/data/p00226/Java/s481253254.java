import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0226();
	}
	
	class AOJ0226{
		public AOJ0226() {
			while(true){
				String r = in.next();
				String a = in.next();
				if(r.equals("0")&&a.equals("0"))break;
				int hit,blow;hit=blow=0;
				HashMap<String,Boolean> map = new HashMap<String, Boolean>();
				for(int i=0;i<a.length();i++){
					if(a.charAt(i)==r.charAt(i))hit++;
					map.put(r.charAt(i)+"",true);
				}
				for(int i=0;i<a.length();i++)if(map.containsKey(a.charAt(i)+""))blow++;
				blow-=hit;
				System.out.println(hit+" "+blow);
			}
		}
	}

	class Problem_C{
		int X,Y,right,mirror,left;
		int x,y;
		
		void doIt(){
			x = in.nextInt();
			y = in.nextInt();
			int result_x=x,result_y=y;
			int mx = X, my = Y, work; 
			switch (right) {
			case 0:
				break;
			case 1:
				work = x;
				result_x = mx-result_x;
				result_y = work;
				work=mx;mx=my;my=work;//swap
				break;
			case 2:
				result_x = mx-result_x;
				result_y = my-result_y;
				break;
			case 3:
				work = result_x;
				result_x = result_y;
				result_y = my - work;
				work=mx;mx=my;my=work;//swap
				break;
			}
			System.out.println("右回転 "+result_x+" "+result_y);
			
			switch (mirror) {
			case 0:
				break;
			case 1:
				result_x = mx-result_x+1;
				break;
			}
			System.out.println("反転　 "+result_x+" "+result_y);
			
			switch (left) {
			case 0:
				break;
			case 1:
				work = result_x;
				result_x = result_y;
				result_y = my - work;
				work=mx;mx=my;my=work;//swap
				break;
			case 2:
				result_x = mx-result_x;
				result_y = my-result_y;
				break;
			case 3:
				work = x;
				result_x = mx-result_x;
				result_y = work;
				work=mx;mx=my;my=work;//swap
				break;
			}
			
			System.out.println("左回転 "+result_x+" "+result_y);
		}

		public Problem_C() {
			X = in.nextInt();
			Y = in.nextInt();
			right = in.nextInt()%4;
			mirror = in.nextInt()%2;
			left = in.nextInt()%4;
			int p = in.nextInt();
			for(int i=0;i<p;i++)doIt();
		}
	}
}