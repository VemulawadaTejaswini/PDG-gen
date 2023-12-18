import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean fu = false;
        for(int i = 1 ; i < 10 && fu == false ; i++ ){
            if(n % i == 0){
                int k = n / i;
                if(k < 10){
                    fu = true;
                }
            }
        }
        if(fu == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}