import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double x=0;
		double y=0;
		double r=0;
		double w=90;
		double t;
		String s;
		String[] sp=new String[2];

		while(true){
		s=scan.nextLine();
		sp=s.split(",");
		r=Double.valueOf(sp[0]);
		t=Double.valueOf(sp[1]);
		x+=r*Math.cos(w/180*Math.PI);
		y+=r*Math.sin(w/180*Math.PI);
		w-=t;
		if(r==0&&t==0){
			break;
		}
		}
		System.out.print((int)x+"\n"+(int)y);
	}

}