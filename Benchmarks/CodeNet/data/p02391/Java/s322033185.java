import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a, b;
        String ans;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        
        if (a == b){
            ans = "==";
        }else if (a > b){
            ans = ">";
        }else{
            ans = "<";
        }
        System.out.println("a "+ans+" b");
    }
}
