import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        if(x < a){
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}
