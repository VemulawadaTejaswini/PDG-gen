
import java.util.Scanner;
 
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String ans = "";
        StringBuffer sb = new StringBuffer(ans);
        for(int i=0;i<y;i++){
            sb.append("U");
        }
        for(int j=0;j<x;j++){
            sb.append("R");
        }
        for(int i=0;i<y;i++){
            sb.append("D");
        }
        for(int j=0;j<x;j++){
                sb.append("L");
        }
        sb.append("L");
        for(int i=0;i<y;i++){
            sb.append("U");
        }
        sb.append("UR");
        for(int j=0;j<x;j++){
            sb.append("R");
        }
        sb.append("DR");
        for(int i=0;i<y;i++){
            sb.append("D");
        }
        sb.append("DL");
        for(int j=0;j<x;j++){
            sb.append("L");
        }
        sb.append("U");
        System.out.println(sb.toString());
        sc.close();
    }
}