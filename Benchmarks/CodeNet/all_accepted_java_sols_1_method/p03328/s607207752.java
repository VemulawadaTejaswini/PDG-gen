import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int c = b - a;
      	int x = 0;
      	for(int i=1; i<=c; ++i){
          x = x + i;
        }
      	int ans = x - b;
      	System.out.println(ans);
	}
}