
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[3][n];
        int[] swim = new int[n];
        int[] bugs = new int[n];
        int[] home = new int[n];

        for (int i=0;i<n;i++){
            int tmp = in.nextInt();
            swim[i]=tmp;
            tmp = in.nextInt();
            bugs[i] = tmp;
            tmp = in.nextInt();
            home[i] = tmp;
        }
        arr[0][0] = Math.max(Math.max(swim[0],bugs[0]),home[0]);
        arr[1][0] = arr[0][0];
        arr[2][0] = arr[0][0];

        for(int col=1;col<n;col++){
            arr[0][col] = Math.max(arr[1][col-1],arr[2][col-1]) + swim[col];
            arr[1][col] = Math.max(arr[0][col-1],arr[2][col-1]) + bugs[col];
            arr[2][col] = Math.max(arr[0][col-1],arr[1][col-1]) + home[col];
        }

        int ans = Math.max(Math.max(arr[0][n-1],arr[1][n-1]),arr[2][n-1]);
        System.out.println(ans);

    }
}
