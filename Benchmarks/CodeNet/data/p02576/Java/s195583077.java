import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int N,x,t;
        N = s.nextInt();
        x = s.nextInt();
        t = s.nextInt();
        int count = 0;
        while(N>0){
            N = N-x;
            count++;
        }
        int result = count * t;
 
        System.out.println(result);
    }
}