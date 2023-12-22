import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		//int n = Integer.parseInt(as.next());
		int a = Integer.parseInt(as.next());
		int b = Integer.parseInt(as.next());
		int c = (int)Math.ceil(a*12.5);
		int d = (int)((a+1)*12.5);
		int e = b * 10;
		int f = (b+1)*10;
		if(c<f&&e<d){
			System.out.println(Math.max(c,e));
		}else{
			System.out.println("-1");
		}
	}
}