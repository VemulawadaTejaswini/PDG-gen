import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long C=stdIn.nextLong();
		if(A%2==1||B%2==1||C%2==1)
			System.out.println(0);
		else{
			if(A==B&&B==C)
				System.out.println(-1);
			else{
				int ans=0;
				long a=0,b=0,c=0;
				while(true){
					a=B/2+C/2;
					b=A/2+C/2;
					c=B/2+A/2;
					A=a;B=b;C=c;
					ans++;
					if(A%2==1||B%2==1||C%2==1)
						break;
				}
				System.out.println(ans);
			}
		}
	}
}