import java.util.Scanner;

public class Main {

	static boolean pos(int y1, int m1, int d1, int y2, int m2, int d2){
		
		if(y1<y2){
			return true;
		}
		else if(y1==y2){
			if(m1<m2){
				return true;
			}
			else if(m1==m2){
				if(d1<=d2){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();

			if(pos(y,m,d,1868,9,7)){
				System.out.println("pre-meiji");
			}
			else if(pos(y,m,d,1912,7,29)){
				System.out.println("meiji "+(y-1867)+" "+m+" "+d);
			}
			else if(pos(y,m,d,1926,12,24)){
				System.out.println("taisho "+(y-1911)+" "+m+" "+d);
			}
			else if(pos(y,m,d,1989,1,7)){
				System.out.println("showa "+(y-1925)+" "+m+" "+d);
			}
			else{
				System.out.println("heisei "+(y-1988)+" "+m+" "+d);
			}
		}
	}
}