import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int a=i.nextInt();
		int b=i.nextInt();
		int c=i.nextInt();
		int ct=0;
		for(int s=a;s<=b;s++){
			if(c%s==0)ct++;
		}
		System.out.println(ct);
	}
}