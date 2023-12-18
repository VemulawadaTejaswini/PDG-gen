import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);

        try{
            while(true){
                int n = scanner.nextInt();
                
                if(n == 0) {return;}
                
                int[] arr = inputIntArray(n);
                
                int sum = 0;
                
                Arrays.sort(arr);
                for(int i = 1; i + 1 < arr.length; ++i) {
                    sum += arr[i];
                }
                
                System.out.println(sum / (arr.length - 2));
            }
        }catch(Exception e){}
    }
}
