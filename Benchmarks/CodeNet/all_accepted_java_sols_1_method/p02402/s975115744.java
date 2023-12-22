import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] num = new int[n];
        long sum = 0;
        
        for(int i = 0; i < n ; i ++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        
        Arrays.sort(num);
        
        System.out.println(num[0] + " " + num[n-1] + " " + sum);
        
        
    }
}
