import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		char a[][]=new char[H+2][W+2];
		String s="";
		int z=0,y=0,fin=0;
		while(z<H){
			s=stdIn.next();
			while(y<W){
				a[z+1][y+1]=s.charAt(y);
				y++;
			}
			y=0;
			z++;
		}z=1;y=1;
		while(z<H+1){
			while(y<W+1){
				if(a[z][y]!=a[z-1][y]&&a[z][y]!=a[z][y-1]&&a[z][y]!=a[z+1][y]&&a[z][y]!=a[z][y+1]&&a[z][y]=='#'){
					fin=1;break;
				}
				y++;
			}y=1;
			if(fin==1)
				break;
			z++;
		}
		if(fin==1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}