import java.util.Scanner;

//Circles Intersection
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			double d = Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb));
			int a = 1;
			if(d > ra+rb)a=0;
			else if(d<=ra)a=2;
			else if(d<=rb)a=-2;
			System.out.println(a);
		}
	}
}