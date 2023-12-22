import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String ans;
        if(str.equals("ABC")){
            ans = "ARC";
        }else{
            ans = "ABC";
        }
        System.out.println(ans);
    }
}
