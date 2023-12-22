
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int indexone=0;
        
        for(int i=0;i<N;i++){
            if(sc.nextInt()==1){
                indexone=i;
                break;
            }
        }
        
        int ANS=0;
        
        if(N==K){
            ANS=1;
        }else{
            ANS+=((N-3+K)/(K-1));
        }
        
        System.out.print(ANS);
    }
}