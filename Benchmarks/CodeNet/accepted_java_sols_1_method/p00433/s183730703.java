import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int S;
        int T;
//        while(true){
            S=0;  T=0;
            for(int i=0;i<4;i++){
                a[i]=sc.nextInt();
                S += a[i];
            }
            for(int i=0;i<4;i++){
                b[i]=sc.nextInt();
                T += b[i];
            }
            if(S>=T){System.out.println(S);}
            else{System.out.println(T);} 
//        }
    }
}
