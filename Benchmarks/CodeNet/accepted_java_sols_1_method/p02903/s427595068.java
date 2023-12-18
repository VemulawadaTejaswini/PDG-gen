import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < W; i++){
            if(i < A){
                sb1.append("1");
            }else{
                sb1.append("0");
            }
        }
        String baseStr = sb1.toString();
        for(int i = 0; i < B; i++){
            System.out.println(baseStr);
        }
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < W; i++){
            if(A <= i){
                sb2.append("1");
            }else{
                sb2.append("0");
            }
        }
        String baseStr2 = sb2.toString();
        for(int i = B; i < H; i++){
            System.out.println(sb2.toString());
        }
    }
}
