import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sa = scan.next();
        String sb = scan.next();
        int a = new Integer(sa);
        int b = new Integer(sb);
        
        String result=compare(a,b);
        System.out.println(result);
    }
    
    public static String compare(int a, int b){
        String result = "";
        if(a>b) result = "a > b";
        if(a<b) result = "a < b";
        if(a==b) result = "a == b";
        return result;
    }
    
}