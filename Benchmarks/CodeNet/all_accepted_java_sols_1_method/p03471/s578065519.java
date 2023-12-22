import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Y = scan.nextInt();

        int Z = Y - 1000*N;

        for(int y = 0;y<=N;++y){
            if(Z-4000*y <0)break;
            if((Z-4000*y)%9000 == 0){
                int z = (Z-4000*y)/9000;
                int x = N - (y+z);
                if(x >=0){
                    System.out.println(z+" "+y+" "+x);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}