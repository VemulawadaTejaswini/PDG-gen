import java.util.*;
public class Main {
	//0215 start

	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<ArrayList<Integer>> xlist = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> ylist = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i <= n; i++){
				int m = sc.nextInt();
				ArrayList<Integer> xl = new ArrayList<Integer>();
				ArrayList<Integer> yl = new ArrayList<Integer>();
				for(int j = 0; j < m; j++){
					int x = sc.nextInt();
					int y = sc.nextInt();
					xl.add(x);
					yl.add(y);
				}
				xlist.add(xl);
				ylist.add(yl);
			}
			for(int i = 1; i < xlist.size(); i++){
				boolean f = match(xlist.get(0), ylist.get(0), xlist.get(i), ylist.get(i));
//				Collections.reverse(xlist.get(0));
//				Collections.reverse(ylist.get(0));
//				f = f || match(xlist.get(0), ylist.get(0), xlist.get(i), ylist.get(i));
//				Collections.reverse(xlist.get(0));
//				Collections.reverse(ylist.get(0));
//				Collections.reverse(xlist.get(i));
//				Collections.reverse(ylist.get(i));
//				f = f || match(xlist.get(0), ylist.get(0), xlist.get(i), ylist.get(i));
				if(f){
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
	}


	private boolean match(ArrayList<Integer> x1,ArrayList<Integer> y1, ArrayList<Integer> x2,ArrayList<Integer> y2) {
		boolean flg = true;
		for(int i= 1; i < x1.size(); i++){
			int xx = x1.get(i) - x1.get(i-1);
			int yy = y1.get(i) - y1.get(i-1);
			int xxx = x2.get(i) - x2.get(i-1);
			int yyy = y2.get(i) - y2.get(i-1);
			if(xx == xxx && yy == yyy){

			}
			else{
				flg = false;
				break;
			}
		}
		if(flg) return true;

		flg = true;
		for(int i= 1; i < x1.size(); i++){
			int xx = x1.get(i) - x1.get(i-1);
			int yy = y1.get(i) - y1.get(i-1);
			int xxx = x2.get(i) - x2.get(i-1);
			int yyy = y2.get(i) - y2.get(i-1);
			if(xx == -1 * yyy && yy == xxx){

			}
			else{
				flg = false;
				break;
			}
		}
		if(flg) return true;

		flg = true;
		for(int i= 1; i < x1.size(); i++){
			int xx = x1.get(i) - x1.get(i-1);
			int yy = y1.get(i) - y1.get(i-1);
			int xxx = x2.get(i) - x2.get(i-1);
			int yyy = y2.get(i) - y2.get(i-1);
			if(xx == -xxx && yy == -yyy){
			}
			else{
				flg = false;
				break;
			}
		}

		if(flg) return true;

		flg = true;
		for(int i= 1; i < x1.size(); i++){
			int xx = x1.get(i) - x1.get(i-1);
			int yy = y1.get(i) - y1.get(i-1);
			int xxx = x2.get(i) - x2.get(i-1);
			int yyy = y2.get(i) - y2.get(i-1);
			if(xx == yyy && yy == -1 * xxx){

			}
			else{
				flg = false;
				break;
			}
		}
		if(flg) return true;

		return false;
	}


	public static void main(String [] args){
		new Main().doit();
	}
}