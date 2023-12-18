import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(solve(array));
    }

    public static long solve(int[] array){
        long sum = 0;
        long mod = (long)Math.pow(10, 9) + 7;
        long product = 0;
        if(array.length == 1){
            return array[0];
        }
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                product = (long)array[i] * (long)array[j];
                sum += product;
            }
        }
        return sum % mod;
    }
}