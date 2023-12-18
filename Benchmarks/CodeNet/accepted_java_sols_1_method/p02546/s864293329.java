import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int last = str.length();
        
        if(str.charAt(last - 1) == 's'){
            System.out.println(str.substring(0,last) + "es");
        }else{
            System.out.println(str + "s");
        }
    }
}
