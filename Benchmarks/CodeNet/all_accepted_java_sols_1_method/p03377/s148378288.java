import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int X=sc.nextInt();
        int d=X-A;
        if(0<=d&&d<=B){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}


