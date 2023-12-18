import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y,z,copy;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y){
			copy=x;
			x=y;
			y=copy;
		}
		if(y>z){
			copy=y;
			y=z;
			z=copy;
		}
		if(x>y){
			copy=x;
			x=y;
			y=copy;
		}
		System.out.println(x+" "+y+" "+z);
		sc.close();
	}
}

