
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num  = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++){
            int changeArr[] = new int[i + 1];
            for(int j = 0; j <= i; j++){
                changeArr[j] = arr[j];
            }
            Arrays.sort(changeArr);
            for(int k = 0; k <= i; k++){
                arr[k] = changeArr[k];
            }
            for(int l = 0; l < num; l++){
                System.out.print(arr[l]);
                if(l != num - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
