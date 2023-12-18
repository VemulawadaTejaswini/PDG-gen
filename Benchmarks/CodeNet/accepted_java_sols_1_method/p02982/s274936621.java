    import java.util.*;
     
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int d = sc.nextInt();
            int x[][] = new int[n][d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    x[i][j] = sc.nextInt();
                }
            }
     
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    int sum = 0;
                    for (int k = 0; k < d; k++) {
                        sum += Math.pow((x[i][k] - x[j][k]), 2);
                    }
     
                    int diss = (int)Math.sqrt(sum);
                    if (sum == diss * diss) {
                        count++;
                    }
                }
            }
     
            System.out.println(count);
    	}
    }