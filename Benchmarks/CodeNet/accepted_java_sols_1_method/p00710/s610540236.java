import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0&&r == 0) break;
            int[] OLD = new int[n];
            int[] NEW = new int[n];
            for(int i = 0; i < n; i++){
                OLD[i] = n - i;
                NEW[i] = n - i;
            }
            for(int i = 0; i < r; i++){
                int p = sc.nextInt(); 
                int c = sc.nextInt(); 
                for(int j = 0; j < p-1; j++){
                    NEW[j + c] = OLD[j];
                }
                for(int j = 0; j < c; j++){
                    NEW[j] = OLD[j + p - 1];
                }

                for(int j = 0; j < n; j++){
                    OLD[j] = NEW[j];
                }
            }
            System.out.println(OLD[0]);
        }
        sc.close();
        
    }
}

