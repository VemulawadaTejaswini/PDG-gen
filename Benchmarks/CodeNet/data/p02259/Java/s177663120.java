import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scIn = new Scanner(System.in);
        int count = 0; //合計交換回数
        int n = scIn.nextInt();
        int[] array = new int[n];
        String[] input = scIn.nextLine().split(" ");
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(input[i]);
        }
    }
}
