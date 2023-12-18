import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
        int bigger = Math.max(a,b);
        int smaller = Math.min(a,b);
        if(bigger - smaller - W > 0){
            System.out.println(bigger - smaller - W);
        }else{
            System.out.println(0);
        }
    }
}
