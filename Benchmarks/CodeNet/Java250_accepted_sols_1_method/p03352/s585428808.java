import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean ebishu = true;
                sc.close();
                while(ebishu){
                        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                                if((Math.log10(n) / Math.log10(i)) % 1 == 0){
                                        ebishu = false;
                                }
                        }
                        n--;
                        if(n == 0) ebishu = false;
                }
                n++;
                System.out.println(n);

        }
}//0=48
//鶏になれ