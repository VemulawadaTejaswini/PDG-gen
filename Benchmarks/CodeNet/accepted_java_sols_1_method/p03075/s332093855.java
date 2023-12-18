
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dis = new ArrayList<Integer>();
        String judge;
        for(int i=0;i<5;i++) {
        	dis.add(Integer.parseInt(sc.next()));
        }
        int k = Integer.parseInt(sc.next());
        int max = Collections.max(dis);
        int min = Collections.min(dis);
        int flag = max - min;
        if(flag > k) {
        	System.out.println(":(");
        }else {
        	System.out.println("Yay!");
        }
	}
}
