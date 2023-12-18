import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
     	Scanner file = new Scanner(System.in);
      	int a = file.nextInt(), b = file.nextInt();
      	String aa = "";
      	String bb = "";
        for (int i = 0; i < b; i++) aa += a;
      	for (int i = 0; i < a; i++) bb += b;
      	if (aa.compareTo(bb) <= 0) System.out.println(aa);
      	else System.out.println(bb);
      	file.close();
    }
}
