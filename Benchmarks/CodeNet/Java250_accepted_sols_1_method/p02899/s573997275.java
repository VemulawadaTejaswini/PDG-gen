import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[n];
        for(int i = 1; i <= n; i++){
            li[sc.nextInt()-1] = i;
        }
        int i = 0;
        for (int k : li){
            if(i != n-1){
                System.out.print(li[i] + " ");
            }else{
                System.out.println(li[i]);
            }
            i++;
        }
    }
}
