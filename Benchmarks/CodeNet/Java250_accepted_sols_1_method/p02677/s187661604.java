
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] cmd=s.split(" ");
		double a=Double.valueOf(cmd[0]);
		double b=Double.valueOf(cmd[1]);
		double c=Double.valueOf(cmd[2]);
		double d=Double.valueOf(cmd[3]);
		double x=((c*60+d)*6)%360;
		double y=c*30+(d*1.0)/2;
		double an=Math.abs(x-y);
		if(an>180)
			an=360-an;
		double a1=a*a+b*b;
		double a2=2*a*b;
		double a3=a1-a2*Math.cos((an*Math.PI)/180);
		System.out.println(Math.sqrt(a3));
	}

}
