import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String first = s.substring(0, 1);
        String middle = s.substring(1, s.length()-1);
        String end = s.substring(s.length()-1);
        System.out.println(first + middle.length() + end);
    }
}