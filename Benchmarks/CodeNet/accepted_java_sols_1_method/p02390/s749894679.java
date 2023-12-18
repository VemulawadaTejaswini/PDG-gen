import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int seconds = Integer.parseInt(str);
	int hours = 0;
	int minutes = 0;
	for (int i = 0; seconds >= (60*60); i++) {
	    hours++;
	    seconds -= (60*60);
	}
	for (int i = 0; seconds >= 60; i++) {
	    minutes++;
	    seconds -= 60;
	}
	System.out.println(hours+":"+minutes+":"+seconds);


    }
}