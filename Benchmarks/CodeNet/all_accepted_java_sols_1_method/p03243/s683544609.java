import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top = n/100;
        int ans = 0;
        if(n-top*100>top*10+top){
            ans = (top+1)*100+(top+1)*10+(top+1);
        }else{
            ans = top*100+top*10+top;
        }
        System.out.println(ans);
    }
}

