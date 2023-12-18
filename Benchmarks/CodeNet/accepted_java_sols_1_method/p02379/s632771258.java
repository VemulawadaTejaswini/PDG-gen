import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			double a,b,c,d;
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			d = scan.nextDouble();
			System.out.println(Math.hypot(a-c,b-d));
		}finally{
			if(scan!=null)scan.close();
		}
	}
}