import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    Result result = execute(sc.nextLine());
        System.out.println(result);
    }

    public static Result execute(String str){
        if(!isPalindrone(str)){
            return Result.No;
        }
        int length = str.length();
        String firstHalf = str.substring(0,(length - 1)/2);
        if(!isPalindrone(firstHalf)){
            return Result.No;
        }
        String lastHalf = str.substring((length + 1)/2);
        if(!isPalindrone(lastHalf)){
            return Result.No;
        }
        return Result.Yes;
    }


    private static boolean isPalindrone(String str) {
        int length = str.length();
        if(length == 1){
            return true;
        }
        for(int i = 0; i< (length+1) / 2 ; i++){
            if(str.charAt(i) != str.charAt(length - i - 1)){
                return false;
            }
        }
        
        return true;
    }

    public static enum Result{
        Yes,
        No;
    }
}
