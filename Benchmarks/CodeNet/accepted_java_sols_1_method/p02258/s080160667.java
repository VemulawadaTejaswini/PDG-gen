

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n ; i++){
            arr[i] = scanner.nextInt();
        }
        int maxMinus = arr[1] - arr[0];
        int minValue = arr[0];
        for (int i= 1; i< n ; i++){
           maxMinus = Math.max(maxMinus, arr[i] - minValue);
           minValue = Math.min(minValue, arr[i]);
        }
        System.out.println(maxMinus);
    }

}

