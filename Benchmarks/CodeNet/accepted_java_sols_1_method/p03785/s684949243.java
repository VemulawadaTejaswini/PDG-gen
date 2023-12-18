import java.util.Scanner;
import java.util.stream.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        int[] T = IntStream.range(0,N).map(i -> scan.nextInt()).sorted().toArray();

        int cnt = 0;
        int start = T[0];
        int index = 0;

        while(true){
            for(int i = 0;i<C;++i){
                if(++index == N)break;
                if(T[index] > start + K)break;
            }
            ++cnt;
            if(index == N)break;
            start = T[index];
        }
        System.out.println(cnt);





    }
}