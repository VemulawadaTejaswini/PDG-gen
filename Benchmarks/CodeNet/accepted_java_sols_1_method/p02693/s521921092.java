import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k,a,b;
		k = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		int flag=0;
      
		for(int i=a;i<=b;i++) {
			if(i%k==0) {
				flag=1;
				break;
			}
		}
      
	if(flag==1)System.out.println("OK");
	else System.out.println("NG");
		sc.close();
	}
}