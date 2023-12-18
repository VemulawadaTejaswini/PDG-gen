import java.lang.reflect.Array;
import java.util.*;
public class Main{
	public static void main(String[] agrs){
		double m,h;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> b=new ArrayList<String>();
		String a;double x,y,z;
		x=0.0;y=0.0;z=0.0;
		while(sc.hasNext()){	
			a=sc.next();
			if(a.equals("0,0"))break;
			String[]c=a.split(",");
			m=Double.parseDouble(c[0]);
			h=Double.parseDouble(c[1]);
			
			x+=(m*Math.sin(Math.toRadians(z)));
			y+=(m*Math.cos(Math.toRadians(z)));
			z+=h;
			}
		System.out.println((int)x);
		System.out.println((int)y);
		
			
		}
		
		
		
		
	}