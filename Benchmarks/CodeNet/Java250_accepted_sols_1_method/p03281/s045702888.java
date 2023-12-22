import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;        
        

        for(int i=1; i<=n; i+=2){
            for(int j=1;j<=n;j+=2){
                if(i%j==0 && i>=j){
                    a++;
                    if(a==8){
                        b++;
                    }
                }
            }
            a=0;
        }
        System.out.print(b);
    }
}