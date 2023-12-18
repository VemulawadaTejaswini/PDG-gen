import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int list[] = {A + B, A - B, A * B};
        int max = list[0];

        for(int i=1; i<3; i++){
            max = Math.max(max, list[i]);
        }
        System.out.println(max);
    }
}