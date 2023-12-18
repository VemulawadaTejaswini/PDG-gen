import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int res=0;
		for(int i=0;i<k;i++)
        {
            if(a!=0)
            {
            	res=res+1;
                a--;
            }
            else if(b!=0)
            {
            	res+=0;
                b--;
            }
            else
            {
            	res=res-1;
                c--;
            }
        }
		System.out.println(res);
	}
}