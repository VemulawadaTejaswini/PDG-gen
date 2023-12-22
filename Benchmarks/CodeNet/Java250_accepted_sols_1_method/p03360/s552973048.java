import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] array = {a,b,c};
        int max = array[0];
        int result;
        if (1<=a && a<=50 && 1<=b && b<=50 && 1<=c && c<=50 && 1<=k && k<=10) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]>max){
                    max=array[j];
                }
            }
        }
            result = (int) (a+b+c-max+(Math.pow(2,k)*max));
        System.out.println(result);
    }
}
