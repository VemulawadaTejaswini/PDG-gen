import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int right = W;
        int left = 0;
        int up = H;
        int down = 0;
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if(a==1) left=Math.max(left,x);
            if(a==2) right=Math.min(right,x);
            if(a==3) down=Math.max(down,y);
            if(a==4) up=Math.min(up,y);
        }
        int ans=Math.max(0,right-left)*Math.max(0,up-down);
        System.out.println(ans);
    }
}
