import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N_scan = scan.nextLine();
    String A_scan = scan.nextLine();
    int ans = 0;
    int kaiteki = 0;
    int add_tmp = 0;
    var N = Integer.parseInt(N_scan);

    var A = A_scan.split(" ");

    var list = new ArrayList<Integer>();
    var circle = new ArrayList<Integer>();

    for (var i = 0;i < N; i++) {
      list.add(Integer.parseInt(A[i]));
    }

    Collections.sort(list, Collections.reverseOrder());

    for (var j = 0; j < N; j++) {
      //要素数3までは無条件で追加
      if (j <= 2){
        circle.add(list.get(j));
        if (j > 0){
          ans = ans + circle.get(j-1);
        }
      }
      //circleから探す
      if (j > 2) {
        kaiteki = 0;
        for (var k = 0; k < circle.size(); k++) {
	  if ( k == circle.size() - 1 ) {
	    if ( circle.get(k) <= circle.get(0) ) {
	      // いまのkaitekiより大きい
	      if ( circle.get(k) > kaiteki) {
	        kaiteki = circle.get(k);
		add_tmp=k+1;
	      }
	    } else {
	      if ( circle.get(0) > kaiteki) {
	        kaiteki = circle.get(0);
		add_tmp=k+1;
	      }
	    }
	  } else {
	    if ( circle.get(k) <= circle.get(k+1) ) {
	      // いまのkaitekiより大きい
	      if ( circle.get(k) > kaiteki) {
	        kaiteki = circle.get(k);
		add_tmp=k+1;
	      }
	    } else {
	      if ( circle.get(k+1) > kaiteki) {
	        kaiteki = circle.get(k+1);
		add_tmp=k+1;
	      }
	    }
	  }
        }
	if (j > 1){
	  circle.add(add_tmp,list.get(j));
	}
        ans = ans + kaiteki;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}