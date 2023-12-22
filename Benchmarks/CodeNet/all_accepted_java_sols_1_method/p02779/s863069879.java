

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sin=new Scanner(System.in);
	    int n=sin.nextInt();
		Map<Integer,Boolean> mp=new HashMap<Integer, Boolean>();
	    boolean k=false;
		for (int i = 0; i < n; i++) {
			int data = sin.nextInt();
			if(mp.containsKey(data)){
				k=true;
			}else mp.put(data,true);
		}
		if(k) System.out.println("NO");
		else System.out.println("YES");
    }
}
