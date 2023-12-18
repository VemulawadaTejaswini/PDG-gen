import java.util.*;
                  
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] R = new int[t];
        int i, j, a, bnf;
        R[0] = sc.nextInt();
        R[1] = sc.nextInt();
        bnf = R[1] - R[0];
                  
        for(i=2; i<t; i++){
            R[i] = sc.nextInt();
            if(R[i]>R[i-1]){
                continue;
            }else{
                if(bnf<0){
                    a = R[i] - R[i-1];
                    if(bnf<a) bnf = a;
                }else{
                    max = R[i-1];
                    a = max - min;
                    if(bnf < a) bnf = a;
                    if(min>R[i]) R[i] = min;
                }
            }
        }
                   
        System.out.println(bnf);
    }
}