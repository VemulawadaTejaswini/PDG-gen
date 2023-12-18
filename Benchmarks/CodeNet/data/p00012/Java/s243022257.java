import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try{
			while(true){
				float x1,y1,x2,y2,x3,y3,xp,yp;
				x1=sc.nextFloat();y1=sc.nextFloat();x2=sc.nextFloat();y2=sc.nextFloat();
				x3=sc.nextFloat();y3=sc.nextFloat();xp=sc.nextFloat();yp=sc.nextFloat();
				x2-=x1;y2-=y1;x3-=x1;y3-=y1;xp-=x1;yp-=y1;
				boolean flag1 = (0<(yp*x2-y2*xp)*(y3*x2-y2*x3))&&(0>(yp*x2-y2*xp)*(yp*x3-y3*xp));
				boolean flag2;
				if(x2==x3){
					flag2=(Math.abs(xp)<Math.abs(x2));
				} else if(y2==y3){flag2=(Math.abs(yp)<Math.abs(y2));}
				else {flag2=(0 < ((y3-y2)/(x3-x2)) * (yp-y2-(y3-y2)*(xp-x2)/(x3-x2))*((y3-y2)/(x3-x2)) * (-y2-(y3-y2)*(-x2)/(x3-x2)));}
				if(flag1&&flag2){System.out.println("YES");}
				else {System.out.println("NO");}
			}
		} catch(Exception e){}
	}
}