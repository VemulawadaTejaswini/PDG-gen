import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=N; i > 0;i--){
            if(i == (int)Math.sqrt(i)*(int)Math.sqrt(i)){
                System.out.println(i);
                break;
            }
        }
    }
}