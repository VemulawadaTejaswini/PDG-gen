import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a];
        sc.nextLine();
        for(int i = 0;i<a;i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int answer = 0;
        for(int i = 0;i<b;i++){
            answer += c[a-1-i];
        }
        System.out.println(answer);
    }
}