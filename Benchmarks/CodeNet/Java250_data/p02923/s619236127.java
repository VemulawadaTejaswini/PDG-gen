
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int H[] = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = Integer.parseInt(sc.next());
        }

        int i = 0;
        int j = 0;
        int count = 0;
        int maxCount = 0;

        while(i < N){
            j = i;
            count = 0;
            while(j < N-1){
                if(H[j] >= H[j+1]){
                    count ++;
                    j ++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
            i += count + 1;
        }


        System.out.println(maxCount);

    }
}



