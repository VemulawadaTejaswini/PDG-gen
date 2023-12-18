import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int ans=0,x=1;
		while(x<=N){
			String a=String.valueOf(x);
			if(a.length()%2==1)
				ans++;
			x++;
		}
		System.out.println(ans);
	}
}