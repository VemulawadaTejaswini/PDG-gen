import java.util.Arrays;
import java.util.Scanner;
class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] A = new int[n][m];
        int[] b = new int[m];
        int[] sum = new int[m];

        scanner.nextLine();
        for(int i=0;i<n;i++){
            String input = scanner.nextLine();
            String inputTmp[] = input.split(" ");
            int j = 0;
            for (String num : inputTmp) {
                A[i][j] = Integer.parseInt(num);
                j++;
            }
        }

        for(int i=0;i<m;i++){
            int num = scanner.nextInt();
            b[i] = num;
        }
        
        for(int[] a: A){
            int val = 0;
            for(int k = 0;k<m;k++){
                val += a[k] * b[k];
            }
            System.out.println(val);
        }
    }
}

