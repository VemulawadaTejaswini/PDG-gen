import java.util.*;

public class Main{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int count = 0;

        while(true){
            if(checkOdd(n, num)){
                break;
            }

            for(int i = 0; i < n; i++){
                num[i] = num[i]/2;
            }
            count++;
        }

        System.out.println(count);
    }

    public static boolean checkOdd(int n, int[] a){
        boolean result = false;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 != 0){
                result = true;
            }
        }
        return result;
    }
}