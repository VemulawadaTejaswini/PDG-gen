import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = scan.nextInt();
        }

        for(int j = 0; j < n; j++){
            for (int i = n - 1; i > j; i--){
                if(x[i - 1] > x[i]){
                    int temp = x[i];
                    x[i] = x[i - 1];
                    x[i - 1] = temp;
                }
            }
        }        

        for (int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.println(x[i]);
            } else {
                System.out.print(x[i] + " ");
            }
        }
    }
}