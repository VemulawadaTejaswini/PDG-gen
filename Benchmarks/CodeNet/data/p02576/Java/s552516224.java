import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int root;
        if(N%X != 0){
            root = N/X + 1;
        }else{
            root = N/X;
        }
        System.out.println(root*T);
    }
}
