import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String S=sc.next();
            int L=S.length();
            if(S.equals("-")) break;
            int N=sc.nextInt();
            for(int i=0;i<N;i++){
                int K=sc.nextInt();
                String S2=S.substring(K,L);
                S2+=S.substring(0,K);
                S=S2;
            }
            System.out.println(S);
        }
    }
}
