import java.util.*;

public class Main{
    static int H,W,A,B;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        H = sc.nextInt();
        W = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        String str1 = "";
        String str2 = "";
        for(int i = 0; i < A; i++){
            str1 += "1";
            str2 += "0";
        }
        for(int i = 0; i < W-A; i++){
            str1 += "0";
            str2 += "1";
        }
        for(int i = 1; i <= H; i++){
           
            if(i <= B){
                System.out.println(str1);
            } else {
                System.out.println(str2);
            }
        }
        
    }
}