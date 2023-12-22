import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        int mod = 2018;
        
        for(int i=L; i<Math.min(L+2018, R); i++){
            for(int j=i+1; j<=Math.min(L+2018, R); j++){
                int modl = i % 2019;
                int modr = j % 2019;
                int modlr = (modl * modr) % 2019;
                if(modlr < mod){
                    mod = modlr;
                }
            }
        }
        System.out.println(mod);
    }
}