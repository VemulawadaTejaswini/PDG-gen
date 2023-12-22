import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] s = new int[N];
        int sum = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            s[i] = sc.nextInt();
            sum += s[i];
            if(s[i] % 10 == 0)
                count++;
        }
        sc.close();

        if(count == N){
            System.out.println(0);
        } else {
            if(sum % 10 != 0){
                System.out.println(sum);
            } else {
                Arrays.sort(s);
                int i = 0;
                while(s[i] % 10 == 0)
                    i++;
                System.out.println(sum - s[i]);
            }
        }
    }
}