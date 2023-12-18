import java.util.*;
public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        if(a+b+c == 17){
            if(a == 5&& b == 5 || a==5 && c ==5 || b == 5 && c == 5){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
	}
}
