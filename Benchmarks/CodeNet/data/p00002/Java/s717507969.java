import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),z=0,i=0;
		while(true){
			if(x<0 || y<0)
				break;
			z=x+y;
			for(i=1;10<=z;i++){
				z=z/10;
			}
			System.out.println(i);
			x=s.nextInt();
			y=s.nextInt();
			z=0;
		}
	}
}