import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int debt = 100000;
        int weeks = stdIn.nextInt();
        
        for(int i = 1; i <= weeks; i++){
            debt *= 1.05;
            
            if(debt % 1000 != 0){
                debt = ((debt / 1000) + 1) * 1000;
            }
        }
        
        System.out.println(debt);

        stdIn.close();
    }
}
