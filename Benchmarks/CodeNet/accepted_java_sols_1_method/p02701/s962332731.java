import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
        Set<String> set = new HashSet<>();
      	for (int i = 0; i < n; ++i) {
        	String s = in.next();
          	if (!set.contains(s)) set.add(s);
        }
      	System.out.println(set.size());
    }
}
