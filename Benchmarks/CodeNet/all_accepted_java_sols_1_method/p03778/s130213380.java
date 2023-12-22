import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W =sc.nextInt(),a = sc.nextInt(),b = sc.nextInt(),result=0;
		if(a<b) {
			result = b-(a+W);
		}
		else if(b<a) {
			result= a-(b+W);
		}
		if(result <=0) result=0;
		System.out.print(result);
	}
 
}