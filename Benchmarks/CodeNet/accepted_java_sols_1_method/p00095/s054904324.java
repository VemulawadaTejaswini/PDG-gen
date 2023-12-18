import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ra = 101, rb = -1;
        while(n--!=0){
            int a = sc.nextInt(), b = sc.nextInt();
            if(rb < b || rb==b && a < ra){
                ra = a;
                rb = b;
            }
        }
        System.out.println(ra+" "+rb);
    }
}