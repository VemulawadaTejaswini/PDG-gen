import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Long L = scan.nextLong();
        Long M = scan.nextLong();
        Long N = scan.nextLong();
        System.out.println(L/(M+N)*M + Math.min(L%(M+N), M));
    }
}
