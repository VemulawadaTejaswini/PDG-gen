import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int h1 = scn.nextInt();
		int m1 = scn.nextInt();
      int h2 = scn.nextInt();
      int m2 = scn.nextInt();
      int k = scn.nextInt();
      int hh = 0;
      int mm = 0;
      int kh = k / 60;
      int km = k % 60;
      if(km<=m2){
        hh = h2 - kh;
        mm = m2 - km;
      }else{
        hh = h2 - 1 - kh;
        mm = m2 + 60 - km;
      }
      int hhh = hh - h1;
      int mmm = mm - m1;
      int ans = hhh * 60 + mmm;
      System.out.println(ans);
	}
}