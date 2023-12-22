import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i< n; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;

        for(int i = 0; i<n; i++){
            long di = (long)(Math.pow(arr[i][0], 2)+Math.pow(arr[i][1], 2));
            //System.out.println(di);
            if(di <= (long)Math.pow(d,2)){
                cnt++;
            }
        }

        System.out.println(cnt);


        
    }
    
}