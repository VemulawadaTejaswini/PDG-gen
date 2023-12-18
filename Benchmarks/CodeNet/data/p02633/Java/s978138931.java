import java.util.*;
public class Main{
    static int goo(int a,int b) {
        while((yuku = a % b) != 0){
            a = b;
            b = yuku;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int all = 360;
        int koubaisuu;
        int anc;
        int yuku;
        int yukuanc;

        if(all%A == 0){
            anc = all/A;
        }else{
            for(int i = 2;i < A;i++){
                if(A % i == 0){
                    yukuanc = goo(all,A);
                    anc = (all/yukuanc)*(A/yukuanc);
                    continue;
                }
            }
            all *= A;
            anc = all/A;
        }
        
        yukuanc = goo(all,A);
        
        
        System.out.println(anc);
    }
}