import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int num = sc.nextInt();
        if((amount % 500) <= num){
                System.out.println("Yes");
        } else{
                System.out.println("No");
        }
    }
}