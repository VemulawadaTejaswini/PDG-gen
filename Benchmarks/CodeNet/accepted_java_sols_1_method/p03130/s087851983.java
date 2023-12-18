import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for(int i = 0; i < 6; i++){
            n[sc.nextInt()]++;
        }
        for(int i = 0; i < 5; i++){
            if(n[i] >= 3){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
