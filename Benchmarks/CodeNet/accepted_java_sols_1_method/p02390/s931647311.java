import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = 
	    new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int seconds = Integer.parseInt(str);
	if(seconds == 0)
	    {
		System.out.println("0:0:0");
	    }else{
	    int sec = seconds % 60;
	    int min =(seconds/60) % 60;
	    int hour =seconds / 3600;
	    
	    System.out.println(hour + ":" + min + ":" + sec);
        }
    }
}