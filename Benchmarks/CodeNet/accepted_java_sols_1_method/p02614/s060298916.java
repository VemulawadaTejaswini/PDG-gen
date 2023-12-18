import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    var ans = 0;

    var num = str_scan.split(" ");

    var H = Integer.parseInt(num[0]);
    var W = Integer.parseInt(num[1]);
    var K = Integer.parseInt(num[2]);

    String[] str2_scan = new String[H];
    String[][] str = new String[H][W];

    for (var i = 0; i < H; i++) {
      str2_scan[i] = scan.nextLine();
      for (var j = 0; j < W; j++) {
        str[i][j] = String.valueOf(str2_scan[i].charAt(j));
      }
    }

    for (var mask_row = 0; mask_row < (1 << H) - 1 ; mask_row++) {
      for(var mask_line = 0; mask_line < (1 << W) - 1; mask_line++) {
	    var black_cnt = 0;
	    //選択された行or列かどうか確認するため、右シフトしつつ1のけたが0かどうかを確認
	    for (var m = 0; m < H; m++){
	      for (var n = 0; n < W; n++){
	        if (((mask_row >> m) & 1) == 0  && ((mask_line >> n) & 1) == 0 ){
              if (str[m][n].equals("#")) {
	            black_cnt++;
	          }
	        }
	      }
	    }
	    if (black_cnt == K) {
	      ans++;
	    }
      }
    }

    System.out.println(ans);
    scan.close();
  }
}