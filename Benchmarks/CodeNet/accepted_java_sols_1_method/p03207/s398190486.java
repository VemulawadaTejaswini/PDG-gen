import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int maxPrice = 0;
        int []prices= new int[N];//dont actually need array 
        int total = 0;
        for(int i = 0; i < N; ++i) {
            prices[i] = sc.nextInt();
            if(prices[i]>maxPrice) {
                maxPrice = prices[i];
            }
            total +=prices[i];
        }
        total = total - maxPrice/2;
        System.out.println(total);
    }

}
