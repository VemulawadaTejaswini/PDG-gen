import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int x=0 , y=0 , min=999999;
        for(int i=1; i<=N; i++){
            x = x+(L+i-1);
            y=L+i-1;
            if(Math.abs(min)>Math.abs(y)){
                min = y;
            }
        }
        x = x-min;
        System.out.println(x);
    }
}