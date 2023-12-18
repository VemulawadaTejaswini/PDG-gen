import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int xx = x/500;
      	int num = x - xx*500;
      	int xxx = num/5;
      	int ans = xx*1000 + xxx*5;
        System.out.println(ans);
	}
}