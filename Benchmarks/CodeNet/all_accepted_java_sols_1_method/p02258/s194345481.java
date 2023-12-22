import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] R = new int[n];
        int maxAns = Integer.MIN_VALUE;

        R[0] = sc.nextInt();
        int min = R[0];
        int max = -2000000000;
        for(int i = 1; i < n; i++){
            R[i] = sc.nextInt();
            max = R[i];
            if(maxAns < max - min){
                maxAns = max - min;
            }
            if(min > R[i]){
                min = R[i];
            }
        }
        System.out.println(maxAns);
    }
}

