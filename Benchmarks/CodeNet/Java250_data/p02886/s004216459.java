import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int k = 1;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-k; j++){
                sum += array[i] * array[i + j + 1];
            }
            k++;
        }
        System.out.print(sum);
    }
}