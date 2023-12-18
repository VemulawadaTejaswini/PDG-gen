import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
      	int t = 0;
      	int c = 0;
      	String ans = "No";
      	for(int i=0; i<=x; i++){
          int num = i*2 + (x-i)*4;
          if(num==y) ans = "Yes";
        }
      	System.out.println(ans);
	}
}