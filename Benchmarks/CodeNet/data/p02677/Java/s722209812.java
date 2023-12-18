import java.util.*;
import java.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
       int tyoushin=sc.nextInt();
       int tanshin=sc.nextInt();
       int jikan=sc.nextInt();
       int hun=sc.nextInt();
       float hena=tyoushin;
      float henb=tanshin;
      float kaku=toRadians(abs((jikan*30+30*hun/60)-hun*6));
      float kai=(sqrt(hena*hena+henb*henb+hena*henb*cos(kaku)));
}
}
