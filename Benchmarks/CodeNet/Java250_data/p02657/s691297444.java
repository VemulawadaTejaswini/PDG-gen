import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int ans = a*b;
      	int ans2 = 0;
      	for(int i=0; i<b; i++){
          ans2 += a;
        }
      	System.out.println(ans2);
	}
}