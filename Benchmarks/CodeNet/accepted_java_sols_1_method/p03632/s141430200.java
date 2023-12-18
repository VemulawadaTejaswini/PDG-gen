import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 100; i++){
            if(a <= i && i < b && c <= i && i < d){
                count++;
            }
        }
        System.out.print(count);
    }
}