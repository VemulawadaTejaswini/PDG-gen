import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String line = sc.nextLine();
            int sum = 0;
            
            if(line.charAt(0) == '0')break;
            
            for(int i = 0; i < line.length(); i++){
                sum += Character.digit(line.charAt(i), 10);
            }
            System.out.println(sum);
        }
    }
}
