import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double A =sc.nextInt();
        int B = sc.nextInt();
        double T = sc.nextInt();
        int i=2;
        double A_num=A;
        int num=0;
        while(A_num<T+0.5){
            num+=B;
            A_num=A*i;
            i++;
        };
        System.out.println(num);
    }
}