import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        String line=sc.next();
        char first=line.charAt(0);
        char last=line.charAt(line.length()-1);
        int mannaka=line.length()-2;
        System.out.println(first+""+mannaka+""+last);
    }
}