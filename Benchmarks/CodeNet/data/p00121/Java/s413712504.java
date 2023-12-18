import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static long[] data = new long[50000];
    public static int[][] situ = new int[2][4];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0, tens=10000000, target=0;
        long n=0;
        count = allsearch(101234567);
        while(sc.hasNext()){
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    Main.situ[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    target += Main.situ[i][j]*tens;
                    tens /= 10;
                }
            }
            for(int i=0;i<count;i++){
                if(target == Main.data[i]%100000000){
                    n = Main.data[i]/100000000-1;
                    break;
                }
            }
            System.out.println(n);
        }
    }

    public static int allsearch(long n){
        int p=-1, q=-1, tens, count=0 , search;
        long k=0, t=0;
        Queue<Long> queue = new LinkedList<Long>();
        queue.add(n);
        queue.add(n);
        Main.data[count]=n;
        count++;
        int[] x = {1,0,-1,0}, y = {0,1,0,-1};
        int[][] tmp = new int[2][4];
        while(!queue.isEmpty()){
            tens = 10000000;
            n = queue.remove();
            k = n/100000000;
            n -= k*100000000;
            if(n<0) break;
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    Main.situ[i][j] = (int)n/tens;
                    n -= Main.situ[i][j]*tens;
                    tens /= 10;
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    if(Main.situ[i][j] == 0){
                        p=i;
                        q=j;
                    }
                }
            }
            for(int xy=0;xy<4;xy++){
                search = 0;
                t = k;
                for(int i=0;i<2;i++){
                    for(int j=0;j<4;j++){
                        tmp[i][j] = Main.situ[i][j];
                    }
                }
                if(p+x[xy] >= 0 && p+x[xy] < 2 && q+y[xy]>=0 && q+y[xy]<4){
                    tmp[p][q] = tmp[p+x[xy]][q+y[xy]];
                    tmp[p+x[xy]][q+y[xy]] = 0;
                }
                n = 0;
                tens = 10000000;
                for(int i=0;i<2;i++){
                    for(int j=0;j<4;j++){
                        n += tmp[i][j]*tens;
                        tens /= 10;
                    }
                }
                for(int i=0;i<count;i++){
                    if(n == Main.data[i]%100000000) search++;
                }
                if(search == 0){
                t++;
                n += t*100000000;
                queue.add(n);
                Main.data[count]=n;
                count++;
                }
            }
        }
        return count;
    }
}
