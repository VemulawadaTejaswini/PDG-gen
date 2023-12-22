
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int gokei = Integer.parseInt(scan.nextLine());
        String[] kachiStr = scan.nextLine().split(" ");
        String[] costStr = scan.nextLine().split(" ");
        
        
        int answer = 0;
        for(int i = 0; i < gokei ; i++){
            int rieki = Integer.parseInt(kachiStr[i]) - Integer.parseInt(costStr[i]);
            if(rieki > 0 ){
                answer += rieki; 
            }
        }
        
        System.out.println(answer);

    }
    
}
