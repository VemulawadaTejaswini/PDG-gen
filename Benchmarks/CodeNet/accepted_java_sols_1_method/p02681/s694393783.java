import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String kurabe = t.substring(0,t.length()-1);
        if(s.equals(kurabe)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}