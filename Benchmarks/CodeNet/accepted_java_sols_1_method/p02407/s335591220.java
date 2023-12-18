import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        String[] str_nums = new String[length];
        
        for(int i=0; i<length; i++) {
            String str_num = scanner.next();
            str_nums[length - 1 - i] = str_num;
        }
        
        System.out.println(String.join(" ", str_nums));
        
        
        
    }
}
