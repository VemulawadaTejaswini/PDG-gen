import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int cnt=0;
		for(int i=100;i>=1;i=i/10) {
			if(a/i!=0)	cnt++;
			a=a%i;
		}
		System.out.println(cnt);

	}

}