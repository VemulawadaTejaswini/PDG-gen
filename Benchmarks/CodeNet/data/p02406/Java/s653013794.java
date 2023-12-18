import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
  
        StringBuilder buf = new StringBuilder();
        for(int i = 3; i <= n; i++) {
            buf.append(checkNum(i) || include3(i) ? " " + i : "");
        }
        
        System.out.println(buf.toString());
    }
    
    private static boolean checkNum(int i) {
        return i % 3 == 0;
    }
    
    private static boolean include3(int i) {
        if(i % 10 == 3) {
            return true;
        }
        
        i /= 10;
        if(i == 0) {
            return false;
        } 
        return include3(i);
    }
}
