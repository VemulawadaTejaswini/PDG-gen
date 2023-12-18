import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4;
		double katamuki1=0,katamuki2=0;
		boolean kinf1=false;
		boolean kzer1=false;
		boolean kinf2=false;
		boolean kzer2=false;
		while(sc.hasNext()) {
			x1=Double.parseDouble(sc.next());
			y1=Double.parseDouble(sc.next());
			x2=Double.parseDouble(sc.next());
			y2=Double.parseDouble(sc.next());
			x3=Double.parseDouble(sc.next());
			y3=Double.parseDouble(sc.next());
			x4=Double.parseDouble(sc.next());
			y4=Double.parseDouble(sc.next());

			if(Math.abs(x2-x1)>0.000001 && Math.abs(y2-y1)>0.000001) {
				katamuki1=(y2-y1)/(x2-x1);
			}
			else if(Math.abs(x2-x1)<=0.000001){
				kinf1=true;
			}
			else if(Math.abs(y2-y1)<0.000001) {
				kzer1=true;
			}

			if(Math.abs(x4-x3)>0.000001 && Math.abs(y4-y3)>0.000001) {
				katamuki2=(y4-y3)/(x4-x3);
			}
			else if(Math.abs(x4-x3)<=0.000001) {
				kinf2=true;
			}
			else if(Math.abs(y4-y3)<0.000001) {
				kzer2=true;
			}

			if(kinf1==false && kinf2==false && katamuki2*katamuki1>-1.0001 && katamuki2*katamuki1<-0.9999) {
				System.out.println("YES");
			}
			else if( kinf1==true && kzer2==true) {
				System.out.println("YES");
			}

			else if( kinf2==true && kzer1==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

			kinf1=false;
			kinf2=false;
			kzer1=false;
			kzer2=false;
		}
	}
}
