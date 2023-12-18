import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int ans = Integer.MAX_VALUE;

        for(int i=-1;i<=1;i+=2){
            for(int j=-1;j<=1;j+=2){
                int X = x*i;
                int Y = y*j;
                if(X>Y)continue;
                ans = Math.min(ans,Y-X +(-i+1)/2 +(-j+1)/2);
            }
        }
        System.out.println(ans);
    }
}