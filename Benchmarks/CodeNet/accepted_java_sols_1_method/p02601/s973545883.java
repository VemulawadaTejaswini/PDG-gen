import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        String ans =  "No";
        for(int i=0;i<=k;i++){
            int B = b;
            for(int count=0; count<i;count++){
                B = B*2;
            }
            for(int j=0;j<=k-i;j++){
                int C = c;
                for(int count=0; count<j;count++){
                    C = C*2;
                }
                if(a < B && B < C){
                    ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }
}   