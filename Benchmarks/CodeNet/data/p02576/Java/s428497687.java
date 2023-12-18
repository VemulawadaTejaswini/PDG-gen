import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int answer = 0;
        if(n%x==0){
            answer = (n/x)*t; 
        }else{
            answer = (n/x+1)*t;
        }
        System.out.println(answer);
    }
}