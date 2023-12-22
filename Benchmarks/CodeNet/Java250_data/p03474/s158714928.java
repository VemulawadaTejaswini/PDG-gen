import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static boolean isInt(String str){
        for (int i = 0; i < str.length(); i++){
            if ( !(str.charAt(i)>= '0' && str.charAt(i) <='9')){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        String [] arr = in.next().split("-");
        if (arr.length == 2 && arr[0].length() == a && arr[1].length() == b){
            if (isInt(arr[0]) && isInt(arr[1]) ) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}