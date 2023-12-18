import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }
        int i;
        for(i = 0; i < a - 1; i++){
            if(array[i] == array[i + 1]){
                continue;
            }else if(array[i] > (array[i + 1])){
                array[i + 1] += 1;
                if(array[i] > array[i + 1]){
                    System.out.println("No");
                    break;
                }
            }
        }
        if(i == (a -1)){
            System.out.println("Yes");
        }
    }
}
