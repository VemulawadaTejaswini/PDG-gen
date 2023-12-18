import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.equals("ABC")){
            str = "ARC";
        } else{
            str = "ABC";
        }

        System.out.println(str);
        sc.close();
        
    }
}