import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        //System.out.println(n/(2*d+1));

        System.out.println((int)Math.ceil((double)n/(2*d+1)));
    }
}
