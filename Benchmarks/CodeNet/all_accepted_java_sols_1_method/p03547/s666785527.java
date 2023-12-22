import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String x = scn.next();
		String y = scn.next();
      	char[] c1 = x.toCharArray();
      	char[] c2 = y.toCharArray();
      	char ch1 = c1[0];
      	char ch2 = c2[0];
      	int cx = (int)ch1;
      	int cy = (int)ch2;
      	if(cx>cy) System.out.println(">");
      	if(cy>cx) System.out.println("<");
      	if(cx==cy) System.out.println("=");
	}
}