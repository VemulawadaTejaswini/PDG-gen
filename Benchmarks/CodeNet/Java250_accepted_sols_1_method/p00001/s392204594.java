
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] mountains = new int[10];
        int i = 0;
        while(true){
            String s = r.readLine();
            mountains[i++] = Integer.valueOf(s);
            if(i >= 10) break;
        }
        Arrays.sort(mountains);
        for(i = 9; i > 6; i--) {
            System.out.println(mountains[i]);
        }
	}
}