import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4;
		double katamuki1=0,katamuki2=0;
		boolean kinf=false;
		while(sc.hasNext()) {
			x1=Double.parseDouble(sc.next());
			y1=Double.parseDouble(sc.next());
			x2=Double.parseDouble(sc.next());
			y2=Double.parseDouble(sc.next());
			x3=Double.parseDouble(sc.next());
			y3=Double.parseDouble(sc.next());
			x4=Double.parseDouble(sc.next());
			y4=Double.parseDouble(sc.next());

			if(Math.abs(y2-y1)>0.000001) {
				katamuki1=(y2-y1)/(x2-x1);
			}
			else {
				kinf=true;
			}

			if(Math.abs(y4-y3)>0.000001) {
				katamuki2=(y4-y3)/(x4-x3);
			}

			if(kinf==true && Math.abs(katamuki2)<0.000001) {
				System.out.println("YES");
			}
			else if( katamuki1*katamuki2>-1.001 && katamuki1*katamuki2<-0.999) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

			kinf=false;

		}
	}
}
