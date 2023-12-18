import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n ;i++){
            a[i] = stdIn.nextInt();
        }

        int count = 0;

        Arrays.sort(a);

        for(int i = 0;i < n;i++){
            int x = 1;
            int y = i;
            if(i == n-1){
                count++;
                break;
            }
            while(a[y] == a[y+1]){
                x++;
                //System.out.println(100);
                if(y >= n-2){
                    break;
                }
                y++;
            }
            if(x%2==1){
                count++;
            }
            i+=(x-1);
        }
        System.out.println(count);
    }

}