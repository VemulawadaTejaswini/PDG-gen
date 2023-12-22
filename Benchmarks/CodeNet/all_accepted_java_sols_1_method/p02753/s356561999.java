import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if("AAA".equals(s) || "BBB".equals(s)){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }   
    }
}