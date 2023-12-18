import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s[]= in.nextLine().split("");
        if ( new HashSet<String>(Arrays.asList(s)).size()==s.length ) System.out.println("yes");
        else System.out.println("no");
    }
}