import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    static int[] a;
    static void sosu(int MAX){
        a = new int[MAX+1];
 
        a[2] = 1;
        for(int i=3;i<=MAX;i+=2){
            a[i] = 1;
        }
        int b = (int) Math.sqrt(MAX);
        for(int i=3;i<=b;i+=2){
            if(a[i] == 1){
                for(int j=i*i;j<=MAX;j+=i){
                    a[j] = -1;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true){
        	int count = 0;
            int N = stdIn.nextInt();
            int P = stdIn.nextInt();
            if(N==-1&&P==-1){
                return;
            }
            sosu(N+1000);
            int[] sosu = new int[50];
            int idx = N+1;
            int z = 0;
            for(int i=idx;z<sosu.length;i++){
                if(a[i] == 1){
                    sosu[z++] = i;
                }
            }
            z = 0;
            int[] wasosu = new int[1000];
            for(int i=0;i<sosu.length;i++){
                for(int j=i;j<sosu.length;j++){
                    wasosu[z++] = sosu[i] + sosu[j];
                    if(z==1000){
                    	count = 1;
                        break;
                    }
                }
                if(count == 1)break;
            }
            Arrays.sort(wasosu);
            System.out.println(wasosu[P-1]);
        }
    }
}