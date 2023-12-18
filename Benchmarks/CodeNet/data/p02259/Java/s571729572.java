import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = scan.nextInt();
        }

        int flag = N, count = 0;
        while(flag != 0){
            flag--;
            for(int j = N-1; j >= 1; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    count++;
                }
            }
        }
        for(int i= 0; i < array.length; i++){
        System.out.print(array[i]);
        if(i < array.length-1){
            System.out.print(" ");
        } else {
            System.out.println();
            System.out.println(count);
        }

        }
    }
}
