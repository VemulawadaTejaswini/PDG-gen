

import java.util.Scanner;

public class Main {
    public int findCost(int arr[]){
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++){
            for(int i=0; i < arr.length - l; i++){
                int j = i + l;
                temp[i][j] = 1000000;
                for(int k=i+1; k < j; k++){
                    q = temp[i][k] + temp[k][j] + arr[i]*arr[k]*arr[j];
                    if(q < temp[i][j]){
                        temp[i][j] = q;
                    }
                }
            }
        }
        return temp[0][arr.length-1];
    }

    public static void main(String[] args) {
        Main mmc = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i = 1; i < N+1; i++) {
            arr[i-1] = sc.nextInt();
            arr[i] = sc.nextInt();
        }

        int cost = mmc.findCost(arr);
        System.out.println(cost);

    }
}

