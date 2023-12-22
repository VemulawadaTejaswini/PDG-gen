import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        int[] x = new int[l];

        loop:for(int i=0; i<l; i++){
            x[i] = S.charAt(i);
            if(i>=1){
                for(int j=0; j<i; j++){
                    if(x[i]==x[j]){
                        System.out.println("no");
                        break loop;
                    }
                }
            }
            if(i==l-1){
                System.out.println("yes");
            }
        }
    }
}