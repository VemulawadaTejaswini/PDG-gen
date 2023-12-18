import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int n = N/15;
    int ans = n*(15*800-200)+(N-n*15)*800;   

    System.out.println(ans);
    }
}
