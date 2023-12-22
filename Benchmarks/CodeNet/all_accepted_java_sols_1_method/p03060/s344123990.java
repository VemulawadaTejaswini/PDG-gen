import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] price = new int[N];
        
        for(int i = 0;i < N;i++) {
        	price[i] = sc.nextInt();
        }
        
        int benefit = 0;
        
        for(int i = 0;i < N;i++) {
        	int a = sc.nextInt();
        	if(price[i] > a) {
        		benefit += price[i] -a;
        	}
        }
        System.out.println(benefit);
    }
}