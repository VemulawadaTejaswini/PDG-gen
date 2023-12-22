import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String number = sc.nextLine();
              if (number.equals("0")) {
                break;
            }
            long sum [] = new long[number.length()];
            long total = 0;
            
            for (int i = 0; i < number.length(); i++) {
                String y = Character.toString(number.charAt(i));
                sum[i] = Integer.parseInt(y);
                total += sum[i];
            }
            System.out.println(total);
                    
        }
        
    }
}
