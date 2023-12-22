import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(t.substring(0, s.length()).equals(s) && t.length()-1==s.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
