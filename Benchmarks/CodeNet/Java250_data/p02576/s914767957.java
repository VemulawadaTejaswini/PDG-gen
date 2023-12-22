import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,x,t;
      	n=in.nextInt();
      	x=in.nextInt();
      	t=in.nextInt();
      	int ans=(int)Math.ceil((double)n/x)*t;
      	System.out.println(ans);
	}
}
