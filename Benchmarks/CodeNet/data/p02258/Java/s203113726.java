import java.util.Scanner;

public class Main {
    int computeMaxProfit(int n, int[] R){
        int maxProfit = -999999999;
        int minPrice = R[0];
        for(int i = 0; i < n - 1; i++){
            if(R[i] < minPrice){
                minPrice = R[i];
            }
            maxProfit = Math.max(maxProfit, R[i+1] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] R = new int[size];
        
        for(int i = 0; i < size; i++){
            R[i] = scanner.nextInt();
        }
        Main test = new Main();
        System.out.println(test.computeMaxProfit(size, R));
    }
}
