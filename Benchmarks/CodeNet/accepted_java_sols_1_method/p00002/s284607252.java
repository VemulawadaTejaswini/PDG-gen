import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Scanner s=new Scanner(System.in);
		int x,y,z,i;
		while(s.hasNext()){
			x=s.nextInt();
			y=s.nextInt();
		z=x+y;
		for(i=1;10<=z;i++){
			z=z/10;
		}
		System.out.println(i);
		}
	}
}