import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
       int tyoushin=sc.nextInt();
       int tanshin=sc.nextInt();
       int jikan=sc.nextInt();
       int hun=sc.nextInt();
       double hena=tyoushin;
      double henb=tanshin;
      double kaku=Math.toRadians(Math.abs((jikan*30+30*hun/60)-hun*6));
      double kai=(Math.sqrt(hena*hena+henb*henb-2*hena*henb*Math.cos(kaku)));
      System.out.println(kai);
}
}
