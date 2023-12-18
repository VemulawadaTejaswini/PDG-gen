import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		float w=Float.parseFloat(str);
		if(w<=48.00)System.out.println("light fly");
		else if(48.00<w && w<=51.00)System.out.println("fly");
		else if(51.00<w && w<=54.00)System.out.println("bantam");
		else if(51.00<w && w<=54.00)System.out.println("feather");
		else if(54.00<w && w<=57.00)System.out.println("light");
		else if(60.00<w && w<=64.00)System.out.println("light welter");
		else if(64.00<w && w<=69.00)System.out.println("welter");
		else if(69.00<w && w<=75.00)System.out.println("light middle");
		else if(75.00<w && w<=81.00)System.out.println("middle");
		else if(81.00<w && w<=91.00)System.out.println("light heavy");
		else if(w<91)System.out.println("heavy");

	    }
    }
}