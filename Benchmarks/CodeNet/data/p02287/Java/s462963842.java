import java.util.*;

public class Main{
    static int H;
    static int[] A;
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb  = new StringBuilder();
    static String crlf = System.getProperty("line.separator");

    public static void main(String[] args){
        H = sc.nextInt();
        A = new int[H];
        for(int i=0; i<H; i++){
            A[i] = sc.nextInt();
        }
        for(int i=1; i<=H; i++){
            sb.append("node " + i + ": key = " + A[i-1] + ", ");
            if(i != 1){
                sb.append("parent key = " + A[i/2-1] + ", ");
            }
            if(2*i <= H){
                sb.append("left key = " + A[2*i-1] + ", ");
            }
            if(2*i+1 <= H){
                sb.append("right key = " + A[2*i] + ", ");
            }
            sb.append(crlf);
        }
        System.out.println(sb.toString());
    }
}
