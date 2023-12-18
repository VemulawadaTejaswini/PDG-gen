import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int x = sc.nextInt();
        while(x != 0){
            System.out.println("Case " + counter + ": " + x);
            x = sc.nextInt();
            counter++;
        }
    }
}
