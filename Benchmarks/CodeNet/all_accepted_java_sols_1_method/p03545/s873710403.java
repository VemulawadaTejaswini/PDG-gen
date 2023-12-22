import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        int A = Integer.parseInt(S.substring(0, 1));
        int B = Integer.parseInt(S.substring(1, 2));
        int C = Integer.parseInt(S.substring(2, 3));
        int D = Integer.parseInt(S.substring(3));
        int suma = A;
        int sumb;
        int sumc;
        int sumd;
        String x;
        String y;
        String z;
        
        for(int i=0; i<2; i++){
            sumb = suma;
            if(i==0){
                sumb += B;
                x = "+";
            }
            else{
                sumb -= B;
                x = "-";
            }
            for(int j=0; j<2; j++){
                sumc = sumb;
                if(j==0){
                    sumc += C;
                    y = "+";
                }
                else{
                    sumc -= C;
                    y = "-";
                }
                for(int k=0; k<2; k++){
                    sumd = sumc;
                    if(k==0){
                        sumd += D;
                        z = "+";
                    }
                    else{
                        sumd -= D;
                        z = "-";
                    }
                    if(sumd==7){
                        System.out.println(A + x + B + y + C + z + D + "=7" );
                        return;
                    }
                }
            }
        }
    }
}