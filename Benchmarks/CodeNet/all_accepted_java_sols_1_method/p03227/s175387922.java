import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String slist[] = s1.split("");
        if(s1.length()==2){
            System.out.println(s1);
        }
        if(s1.length()==3){
            String s2 = slist[2] + slist[1] + slist[0];
            System.out.println(s2);
        }
    }
}
