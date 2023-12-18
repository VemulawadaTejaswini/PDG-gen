import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double v,t,y,temp;
		int n;
		while(s.hasNext()){
			v=s.nextDouble();
			t=v/9.8;
			y=4.9*t*t;
			n=(int) ((y+5)/5);
			if((y+5)%5!=0) n++;
			System.out.println(n);
		}
	}
}