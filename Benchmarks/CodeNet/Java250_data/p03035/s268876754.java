import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int yen = sc.nextInt();
        
        if(year >= 13){
            System.out.print(yen);
        }else if(12 >= year && year >= 6){
            System.out.print(String.valueOf(yen/2));
        }else{
            System.out.print('0');
        }
    }
}
