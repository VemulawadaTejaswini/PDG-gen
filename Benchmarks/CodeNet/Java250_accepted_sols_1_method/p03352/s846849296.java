import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int max=1;
         for (int i = 1; i < n; i++) {
            for (int j = 2; j <10 ; j++) {
                if(n>=Math.pow(i, j)){
                    max=(int) ((max<Math.pow(i,j)) ? Math.pow(i,j):max);
                }else{break;}
            }
         }
         System.out.println(max);
    }
}
