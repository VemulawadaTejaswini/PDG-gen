import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			double x=sc.nextInt();
			double h=sc.nextInt();
			if(x==0&&h==0){
				break;
			}
			double sh=Math.sqrt(h*h+(x/2)*(x/2));
			System.out.println(x*sh/2*4+x*x);
		}
	}
}