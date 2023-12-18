import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = new int[13];
        for(int i=1;i<=7;i++) ans[i]=1;
        for(int i=8;i<=12;i+=2) ans[i]=1;
        ans[4]=2;
        ans[6]=2;
        ans[9]=2;
        ans[11]=2;
        ans[2]=3;
        String res = "No";
        if(ans[x]==ans[y]) res = "Yes";
        System.out.println(res);
    }
}
