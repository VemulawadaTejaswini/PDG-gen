import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try{
				while(true){
			float x1,y1,x2,y2,x3,y3,px,py;
			x1=sc.nextFloat();y1=sc.nextFloat();x2=sc.nextFloat();y2=sc.nextFloat();
			x3=sc.nextFloat();y3=sc.nextFloat();px=sc.nextFloat();py=sc.nextFloat();
			x2-=x1;y2-=y1;x3-=x1;y3-=y1;px-=x1;py-=y1;
			boolean flag1 = (0<(py*x2-y2*px)*(y3*x2-y2*x3));
			boolean flag2;
			if(x2==x3){
				flag2=(Math.abs(px)<Math.abs(x2));
			} else if(y2==y3){flag2=(Math.abs(py)<Math.abs(y2));}
			else {flag2=(0 < ((y3-y2)/(x3-x2)) * (py-y2-(y3-y2)*(px-x2)/(x3-x2)));}
			if(flag1&&flag2){System.out.println("YES");}
			else {System.out.println("NO");}
			}
		} catch(Exception e){}
	}
}