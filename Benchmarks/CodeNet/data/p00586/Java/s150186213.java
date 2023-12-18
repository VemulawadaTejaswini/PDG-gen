import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String inputText = scan.nextLine();
            String[] nums = inputText.split(" ",0);
            int num=Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
            System.out.println(num);
        }
        
    }
}