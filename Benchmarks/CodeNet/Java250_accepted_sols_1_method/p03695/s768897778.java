import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		boolean[] c = new boolean[8];
		int t = 0;
		int N = in.nextInt();
                for(int i = 0; i < N; i++){
                   int r = in.nextInt();
                   if(r >= 3200) t++;
                   if(r >= 2800 && r < 3200) c[7] = true;
                   if(r >= 2400 && r < 2800) c[6] = true;
                   if(r >= 2000 && r < 2400) c[5] = true;
                   if(r >= 1600 && r < 2000) c[4] = true;
                   if(r >= 1200 && r < 1600) c[3] = true;
                   if(r >= 800 && r < 1200) c[2] = true;
                   if(r >= 400 && r < 800) c[1] = true;
                   if(r >= 1 && r < 400) c[0] = true;
                }
		int min = 0;
                for(int i = 0; i < 8; i++)
                    if(c[i]) min++;
		if(min == 0) System.out.println(1 + " " + t);
                else System.out.println(min + " " + (min + t));
	}
}
