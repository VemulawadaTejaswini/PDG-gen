import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //2~20
        int A = sc.nextInt();
        //1~20
        int B = sc.nextInt();
        int Ans = 0;
        while((B-1) > (A-1)*Ans){
            Ans += 1;
        }
        System.out.println(Ans);
        sc.close();
    }
}