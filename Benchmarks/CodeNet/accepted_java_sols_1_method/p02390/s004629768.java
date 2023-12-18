import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int S = scanner.nextInt();
        
        int h,m,s;
        
        h = S/3600;
        
        m = S%3600/60;
        
        s = S%3600%60;
        
        
        
        System.out.println(h + ":" + m + ":" + s);
    }
}

