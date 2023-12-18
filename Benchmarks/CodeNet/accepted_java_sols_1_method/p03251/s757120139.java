import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        for(int i = 0; i < n; i++){
            x = Math.max(sc.nextInt(), x);
        }
        for(int i = 0; i < m; i++){
            y = Math.min(sc.nextInt(), y);
        }
        if(y > x){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
        }
}