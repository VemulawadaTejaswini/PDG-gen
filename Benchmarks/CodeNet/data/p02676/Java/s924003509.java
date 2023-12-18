import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int l = t.length();
        int k;
        if(l == 1){
            k = t.charAt(0) - '0';
        }else if(l == 3){
            k = 100;
        }else{
            k = (t.charAt(0) - '0') * 10 + t.charAt(1) - '0';
        }
        String s = sc.nextLine();
        int n = s.length();
        if(n <= k){
            System.out.println(s);
        }else{
            System.out.println(s.substring(0,k) + "...");
        }
    }
}