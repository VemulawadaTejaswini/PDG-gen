import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(solve(in.nextInt()));
        }
    }
    static int solve(int n){
        int res = 0;
        for(int i=0;i<10;i++)for(int j=0;j<10;j++)for(int k=0;k<10;k++)for(int l=0;l<10;l++){
            res += (i+j+k+l == n) ? 1 : 0;
        }
        return res;
    }

}