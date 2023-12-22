import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	String s = scn.next();
		String[] list = s.split("");
      	int count = 0;
		for(int i=1; i<n; i++){
			if(list[i].equals(list[i-1])) count++;
		}
      	System.out.println(n-count);
	}
}
