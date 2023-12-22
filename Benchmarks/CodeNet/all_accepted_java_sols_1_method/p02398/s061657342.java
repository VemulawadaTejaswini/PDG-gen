import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int yakusu=0;
		int kaisu=0;
		for(int x=a;x<=b;x++) {
			yakusu=c%x;
			if(yakusu==0) {
				kaisu++;
			}
		}
		System.out.println(kaisu);
	}
}

