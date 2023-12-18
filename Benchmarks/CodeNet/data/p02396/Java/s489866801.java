import java.util.Scanner;
public class Aizu1_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        for(int i = 1;i <= 10000;i++){
            int x = stdIn.nextInt();
            System.out.println("Case "+i+": "+x);
        }
    
}
}