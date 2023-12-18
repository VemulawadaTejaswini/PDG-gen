import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] SS = s.toCharArray();
    SS[5] =' ';
    SS[13] = ' ';

    System.out.println(String.valueOf(SS));  
    }
}
