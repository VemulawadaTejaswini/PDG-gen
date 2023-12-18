import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
    char t = a.charAt(0);
    char u = a.charAt(1);
    char v = a.charAt(2);
        char w = b.charAt(0);
        char x = b.charAt(1);
        char y = b.charAt(2);
        if(t == y &&u == x&&v==w){
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
