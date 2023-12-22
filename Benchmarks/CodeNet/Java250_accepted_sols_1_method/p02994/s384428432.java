import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());
        int tasteOfPie = 0;
        int minApple = 300;
        int minIndex = 0;
        for (int i = 1; i < N+1; ++i){
            int taste =  L + i - 1;
            tasteOfPie += taste;
            if (minApple > Math.abs(taste)){
                minApple = Math.abs(taste);
                minIndex = i;
            }
        }
        System.out.println(tasteOfPie - (L+minIndex-1));
    }
}