import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		double x=0,y=0,angle=90;
		while(true){
            String[] str=s.next().split(",");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            if(a==0&&b==0)break;
            x+=a*Math.cos(Math.toRadians(angle));
            y+=a*Math.sin(Math.toRadians(angle));
            angle-=b;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}	
}
//by Tuvshee 12.05.2012
//Treasure Hunt