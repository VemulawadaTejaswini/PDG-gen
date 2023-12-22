import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += l + i;
        }

        if(n + l <= 0){
            System.out.println(sum - (n + l - 1));
        }else if(l < 0){
            System.out.println(sum);
        }else{
            System.out.println(sum - l);
        }

    }
}
