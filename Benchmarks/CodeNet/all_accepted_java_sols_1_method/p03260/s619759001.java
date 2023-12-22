import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "No";
        for(int c=1; c<=3; c++){
            if((a*b*c)%2 == 1){
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}