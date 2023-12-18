import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int g_a=0,g_b=0,g_c=0;

		for(int i=0;i<2;i++){
			int a=sc.nextInt();
			if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12) g_a++;
			else if(a==4 ||a==6 ||a==9 ||a==11 ) g_b++;
			else if(a==2) g_c++;

		}
		
		if(g_a==2 || g_b==2 || g_c==2) System.out.println("Yes");
		else System.out.println("No");
	}
} 