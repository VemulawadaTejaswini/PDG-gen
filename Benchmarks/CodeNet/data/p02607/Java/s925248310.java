import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int count=0, n = in.nextInt();
        int[] ans = new int[n];

        for (int i = 0; i <n; i++) {
           ans[i] = in.nextInt();
           if (ans[i] %2 ==1 && i %2 ==1){
               count++;
           }
        }
        System.out.println(count);
    }
}
