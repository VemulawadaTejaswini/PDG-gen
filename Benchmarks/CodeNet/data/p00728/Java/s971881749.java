import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int MAX = 0;
            int MIN = 10000;
            int sum = 0;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                sum += x;
                if(x >= MAX) MAX = x;
                if (MIN >= x) MIN = x;;
            }
            int ans = (sum - MAX - MIN)/(n-2);
            System.out.println(ans);
        }
        sc.close();
        
    }
}

