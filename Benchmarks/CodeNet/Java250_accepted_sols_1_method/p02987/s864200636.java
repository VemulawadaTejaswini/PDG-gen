import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1 = str.replace(str.substring(0,1),"");
        if(s1.length() !=2) {
            System.out.println("No");
            return;
        }
        String s2 = s1.replace(s1.substring(0,1),"");
        if(s2.length()==0) System.out.println("Yes");
        else System.out.println("No");

    }
}