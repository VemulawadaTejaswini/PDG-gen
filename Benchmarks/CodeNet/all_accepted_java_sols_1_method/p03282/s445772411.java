import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        String input = scan.next();
        long k = scan.nextLong();

        if(k == 1){
            System.out.println(input.charAt(0));
        } else {
            for(int i = 0; i < 100; i++){
                if(input.charAt(i) == '1' && i == k - 1){
                    System.out.println(1);
                    break;
                } else if(input.charAt(i) != '1'){
                    System.out.println(input.charAt(i));
                    break;
                }
            }
        }


    }
}