import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = scan.nextInt();
        }

        int minindex;
        int min;
        int max = list[n-1];
        int diff = max-list[0];
        for(int m=n; m>0; ){
            if(m==1){
                if(diff<list[1]-list[0]){
                    diff = list[1]-list[0];
                }
                m--;
            }
            minindex = 0;
            min = list[0];
            for (int i = 0; i < m; i++) {
                if (list[i] < min) {
                    minindex = i;
                    min = list[i];
                }
            }
            if (minindex == m-1) {
                if(diff<min-list[m-2]){
                    diff = min-list[m-2];
                }
                m--;
            } else {
                max = list[minindex+1];
                for (int i = minindex + 1; i < n; i++) {
                    if (list[i] > max) {
                        max = list[i];
                    }
                }
                if(diff<max-min){
                    diff = max-min;
                }
                m = minindex;
            }
        }
        System.out.println(diff);
    }
}

