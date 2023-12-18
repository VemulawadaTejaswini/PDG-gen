import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a;
		int sum=0;
		int c=10;
		for(;;) {
			if(a<10) {
				sum+=a;
				break;
			}
			sum+=a%c;
			a=a/10;
		}
		if(b%sum==0)System.out.println("Yes");
		else System.out.println("No");
		//System.out.println(sum);
	}
}