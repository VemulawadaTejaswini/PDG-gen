//ITP1_1_D:   Watch
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
         int sec = Integer.parseInt(in.readLine());
         
         int hh=sec/3600;
         int mm=(sec%3600)/60;
         int ss=sec%60;
         
         System.out.println(hh+":"+mm+":"+ss);
        
	}
}