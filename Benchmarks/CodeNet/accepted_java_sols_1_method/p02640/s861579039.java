import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String ans = "No";
        for(int a=0;a<=x;a++){
            int b = x-a;
            if(a*2+b*4==y){
                ans="Yes";
            }
        }
        System.out.println(ans);
    }
}