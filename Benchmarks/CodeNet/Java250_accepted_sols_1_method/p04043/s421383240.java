import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        if(a == 7 && b == 5 && c == 5){
            System.out.print("YES");
        }else if(a == 5 && b == 7 && c == 5){
            System.out.print("YES");
        }else if(a == 5 && b == 5 && c == 7){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}