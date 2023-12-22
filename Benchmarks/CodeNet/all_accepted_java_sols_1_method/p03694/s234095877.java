import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int[] b = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int max = b[a-1]-b[0];
        System.out.println(max);
    }
}