import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] x = new int[N];

        for(int i =0; N > i; i++){
            x[i] = sc.nextInt();     
        }
        int tmp = 0;
        int a =  0;

        for(int j = 0; N  > j; j++){  
            int b = Math.abs(X - x[j]);
            if(a == 0){
                a = b;
            }else{
                while ((tmp = b % a) != 0) {
                    b = a;
                    a = tmp;
                }
            }
        }
        System.out.println(a);
    }

}