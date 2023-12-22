import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // initializing
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        int[] Table = new int[n];

        //base case building
        Table[0] = 0;
        Table[1] = Math.abs(h[0] - h[1]);
        if (n < k) {
            for (int i =2; i < n; i++){
                int c = -1;
                for (int j = i; j > 0; j--){
                    int z = Table[i - j] + Math.abs(h[i - j] - h[i]);
                    if (z < c || c == -1) {
                        c = z;
                    }
                }
                Table[i] = c;
            }
        } 
        else {
            for (int i = 2; i < k; i++) {
                int c = -1;
                for (int j = i; j > 0; j--) {
                    int z = Table[i - j] + Math.abs(h[i - j] - h[i]);
                    if (z < c || c == -1) {
                        c = z;
                    }
                }
                Table[i] = c;
            }


            // iterative case
            for (int i = k; i < n; i++) {
                int c = -1;
                for (int j = i - 1; j >= i - k; j--) {
                    int z = Table[j] + Math.abs(h[j] - h[i]);
                    if (z < c || c == -1) {
                        c = z;
                    }
                }
                Table[i] = c;
            }
        }

            System.out.println(Table[n - 1]);

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] h = new int[n];
//        for (int i = 0; i< n; i++){
//            h[i] = scanner.nextInt();
//        }
//
//        int[] Table = new int[n];
//        Table[0] = 0;
//        Table[1] = Math.abs(h[0]-h[1]);
//
//        for (int i = 2; i < n; i++){
//            int a = Table[i-2] + Math.abs(h[i-2]-h[i]);
//            int b = Table[i-1] + Math.abs(h[i-1]-h[i]);
//
//            if (a < b){
//                Table[i] = a;
//            }
//            else {
//                Table[i] = b;
//            }
//        }
//        System.out.println(Table[n-1]);
        }
    }

