
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
        int[] dish = new int[5];
        int min = 999;
        int tmp;
        int answer = 0;
        for(int i = 0;i<5;i++){
            dish[i] = sc.nextInt();
            if(min > dish[i]%10&&dish[i]%10!=0){
                min = dish[i]%10;
            }
            if(dish[i]%10 != 0){
                tmp = dish[i]/10;
                dish[i] = tmp *10 +10;
            }
        }
        if(min ==999){
            min = 0;
            for(int j = 0;j<5;j++){
            answer+=dish[j];
        }        
        System.out.print(answer);
        }else{
        for(int j = 0;j<5;j++){
            answer+=dish[j];
        }        
        answer = answer + min -10;
        System.out.print(answer);
        }
    }
    
}
