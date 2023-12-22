import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        while(N>1){
            N/=2;
            i*=2;
        }
        System.out.println(i);
    }
}
