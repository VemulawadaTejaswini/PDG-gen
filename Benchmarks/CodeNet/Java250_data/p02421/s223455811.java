import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p_a = 0;
        int p_b = 0;
        for(int i=0; i<n; i++){
            String str_a = sc.next();
            String str_b = sc.next();
            if(str_a.compareTo(str_b) > 0) {p_a += 3;}
            else if(str_a.equals(str_b)) {
                p_a++;
                p_b++;
            }
            else {p_b += 3;}
        }
        System.out.println(p_a + " " + p_b);
    }
}
