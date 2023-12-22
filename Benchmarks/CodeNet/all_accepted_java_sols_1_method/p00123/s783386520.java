import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
		double f,t;
		
		f=scan.nextDouble();
		t=scan.nextDouble();
		String str="";
		if(f>=1*60+10.0 || t>=2*60+28.0)str="NA";
		if(f<1*60+10.0 && t<2*60+28.0)
		    {
		
str="E";
		    }
		if(f<55.0 && t<1*60+56.0)str="D";
		if(f<50.0 && t<1*60+45.0)str="C";
		if(f<43.0 && t<1*60+29.0)str="B";
		if(f<40.0 && t<1*60+23.0)str="A";
		if(f<37+0.5 && t<1*60+17.0)str="AA";
		if(f<35+0.5 && t<1*60+11.0)str="AAA";
		
		System.out.println(str);
	    }
    }
}