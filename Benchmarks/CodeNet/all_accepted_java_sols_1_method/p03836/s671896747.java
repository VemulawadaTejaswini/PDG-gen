import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);     
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        StringBuffer str = new StringBuffer();

        int x = tx - sx, y = ty - sy;
        int cx = Math.abs(x), cy = Math.abs(y);

        // go
        if (x >= 0) {
            for (int i = 0; i < cx; i++) {
                str.append("R");
            }
        } else {
            for (int i = 0; i < cx; i++) {
                str.append("L");
            }
        }

        if (y >= 0) {
            for (int i = 0; i < cy; i++) {
                str.append("U");
            }
        } else {
            for (int i = 0; i < cy; i++) {
                str.append("D");
            }
        }
        String go = str.toString();
        str = new StringBuffer();

        // return
        if (x >= 0) {
            for (int i = 0; i < cx; i++) {
                str.append("L");
            }
        } else {
            for (int i = 0; i < cx; i++) {
                str.append("R");
            }
        }

        if (y >= 0) {
            for (int i = 0; i < cy; i++) {
                str.append("D");
            }
        } else {
            for (int i = 0; i < cy; i++) {
                str.append("U");
            }
        }
        String ret = str.toString();
        str = new StringBuffer();

        // second go
        if (x >= 0) {
            str.append("D");
        } else {
            str.append("U");
        }

        if (y >= 0) {
            str.append("R");
        } else {
            str.append("L");
        }

        str.append(go);

        if (x >= 0) {
            str.append("U");
        } else {
            str.append("D");
        }

        if (y >= 0) {
            str.append("L");
        } else {
            str.append("R");
        }

        // second return
        if (x >= 0) {
            str.append("U");
        } else {
            str.append("D");
        }

        if (y >= 0) {
            str.append("L");
        } else {
            str.append("R");
        }

        str.append(ret);

        if (x >= 0) {
            str.append("D");
        } else {
            str.append("U");
        }

        if (y >= 0) {
            str.append("R");
        } else {
            str.append("L");
        }


        System.out.println(go + ret + str.toString());
        sc.close();
	}
}