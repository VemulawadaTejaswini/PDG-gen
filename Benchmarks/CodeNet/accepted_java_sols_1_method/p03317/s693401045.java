import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int K = sc.nextInt();
        int answer;
        int[] array = new int[number];
        for(int i = 0;i<number;i++){
            array[i] = sc.nextInt();
        }
        
       answer = number -K;
       if(answer%(K-1) == 0){
           System.out.print(answer/(K-1) + 1);
       }else{
           System.out.print(answer/(K-1) +2);
       }
        
    }
    
}
