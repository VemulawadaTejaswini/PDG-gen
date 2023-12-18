import java.util.*;
 
class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int num = i;
            if (i % 3 == 0){
                System.out.print(" " + i);
                continue;
            }
            while(num > 0){
                if (num % 10 == 3){
                    System.out.print(" " + i);
                    break;
                }
                num/= 10;
            }
        }
 
        System.out.println();
    }
}