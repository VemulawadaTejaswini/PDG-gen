import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int T = 0;
        int X = 0;
        int Y = 0;
        for(int i=0;i<N;++i){
            int t=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            int dis =Math.abs(X-x) + Math.abs(Y-y);
            if(dis <= t-T && (t-T-dis)%2==0){

            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}