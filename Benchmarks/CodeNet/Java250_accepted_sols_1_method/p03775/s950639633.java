import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long n = sc.nextLong();
                sc.close();
                long fia = 0;
                long fkh = 0;
                int yono = (int)Math.log10(n);
                for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                        if(n % i == 0){
                                fia = n / i;
                                fkh = i;
                                yono = Math.min(yono , Math.max((int)Math.log10(fia) , (int)Math.log10(fkh)));
                        }
                }
                System.out.println(yono + 1);
        }
}