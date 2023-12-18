import java.util.*;
public class Main{
    static int goo(int a,int b) {
        int yuku;
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
                    yuku = (all/yukuanc)*(A/yukuanc);
                    anc = yuku/A;
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