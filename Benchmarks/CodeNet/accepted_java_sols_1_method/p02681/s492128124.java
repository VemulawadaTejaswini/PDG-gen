import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        int size = s.length();
        String tCut = t.substring(0, size);
        if (s.equals(tCut)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
