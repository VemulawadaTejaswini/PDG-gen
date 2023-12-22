import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		String c=sc.next();
		char a[]=c.toCharArray();
		int b=0;
		for(int i=0;i<p/2;i++) {
				if(a[i]!=a[i+p/2])
					b++;
		}
		if(p%2==0){
			if(b==0) {
			System.out.print("Yes");	
			}else {
			System.out.print("No");
			}
		}else
			System.out.print("No");
			
	}
}