import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Global{
    public static long[] data = new long[50000];
    public static int[][] situ = new int[2][4];
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0, tens=10000000, target=0;
        long n=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                Global.situ[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                target += Global.situ[i][j]*tens;
                tens /= 10;
            }
        }
        count = allsearch(101234567);
        for(int i=0;i<count;i++){
            if(target == Global.data[i]%100000000){
                n = Global.data[i]/100000000;
                break;
            }
        }
        System.out.println(n-1);
    }

    public static int allsearch(long n){
        int p=-1, q=-1, tens, count=0 , search;
        long k=0, t=0;
        Queue<Long> queue = new LinkedList<Long>();
        queue.add(n);
        queue.add(n);
        Global.data[count]=n;
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
                    Global.situ[i][j] = (int)n/tens;
                    n -= (long)Global.situ[i][j]*tens;
                    tens /= 10;
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    if(Global.situ[i][j] == 0){
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
                        tmp[i][j] = Global.situ[i][j];
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
                        n += (long)tmp[i][j]*tens;
                        tens /= 10;
                    }
                }
                for(int i=0;i<count;i++){
                    if(n == (long)Global.data[i]%100000000) search++;
                }
                if(search == 0){
                t++;
                n += t*100000000;
                queue.add(n);
                Global.data[count]=n;
                count++;
                }
            }
        }
        return count;
    }
}
