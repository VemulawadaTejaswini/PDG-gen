import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2==1){
            if(b%2==1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
