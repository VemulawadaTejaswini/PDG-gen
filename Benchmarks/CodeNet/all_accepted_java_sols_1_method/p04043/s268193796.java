import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt5=0, cnt7=0;
		for(int i=0; i<3; ++i)
		{
			int x=sc.nextInt();
			if(x==5) ++cnt5;
			else if(x==7) ++cnt7;
		}
		System.out.println((cnt5==2 && cnt7==1)?"YES":"NO");
		sc.close(); 
	}

}