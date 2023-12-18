import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = 1;
        for(int i = 1; i <= x; i++){
            if(x%i == 0){
                z = x/i;
                if(y%z == 0){
                    break;
                }
            }
        }
        System.out.println(z);
    }  
}
