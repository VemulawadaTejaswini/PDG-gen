import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String S = scan.next();
        scan.close();
        if(S.equals("Sunny")){
            System.out.println("Cloudy");
        }else if (S.equals("Cloudy")){
            System.out.println("Rainy");
        }else{
            System.out.println("Sunny");
        }
        

    }
        
    
}
