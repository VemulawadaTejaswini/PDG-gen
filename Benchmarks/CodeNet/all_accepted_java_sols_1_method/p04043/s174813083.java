import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int z=0,y=0,x=0;
		if(a==5)
			z++;
		else
			y++;
		if(b==5){
			z++;
		}
		else{
			y++;
		}
		if(c==5)
			z++;
		else
			y++;
		if(z==2&&y==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}