
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
           
        
        for (int i = 0; i < (3 - 1); i++) {
            for (int j = (3 - 1); j > i; j--) {
                if(array[j-1] > array[j]){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0;i < 3; i++) {
            System.out.print(array[i] + " ");
            
        }
        

    }

}
 
