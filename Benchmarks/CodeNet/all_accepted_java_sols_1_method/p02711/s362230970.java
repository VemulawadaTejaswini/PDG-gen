import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = false;
        while(n!=0){
            if(n%10==7)flag = true;
            n = n/10;
        }
        String ans = (flag)?"Yes":"No";
        System.out.println(ans);
    }
}
