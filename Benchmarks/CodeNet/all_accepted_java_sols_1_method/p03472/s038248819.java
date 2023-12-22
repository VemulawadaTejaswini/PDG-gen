import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int H = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0;i<N;++i){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int maxindex = 0;
        for(int i=0;i<N;++i){
            if(a[i] > a[maxindex]){
                maxindex =i;
            }
        }
        int bmax = b[maxindex];
        b[maxindex] =0;
        Arrays.sort(b);

        int ans = 0;
        int h = 0;
        int index = N-1;
        while(true){
            ++ans;
            if(h + Math.max(a[maxindex], Math.max(bmax, b[index])) >=H)break;
            h += Math.max(a[maxindex], b[index]);
            if(index >0)--index;
        }





        System.out.println(ans);
    }
}