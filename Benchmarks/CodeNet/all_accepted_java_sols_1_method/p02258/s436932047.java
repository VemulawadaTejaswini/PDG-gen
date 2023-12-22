import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer =  Integer.MIN_VALUE;
        int min = scan.nextInt();
        for(int x = 0; x < n - 1; x++){
            int r = scan.nextInt();
            answer = Math.max(answer, r - min);
            min = Math.min(min, r);
        }
        System.out.println(answer);

    }
}
