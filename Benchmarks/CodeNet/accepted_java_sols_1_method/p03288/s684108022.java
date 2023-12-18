import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        String str;
        if(r < 1200)
            str = "ABC";
        else if(r < 2800)
            str = "ARC";
        else 
            str = "AGC";
        System.out.println(str);
            
    }
    
}