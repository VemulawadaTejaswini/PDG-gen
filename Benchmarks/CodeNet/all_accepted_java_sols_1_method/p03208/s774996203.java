import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] kane = new int[N];

        for(int i=0;i<N;i++){
            kane[i] = scan.nextInt();
        }
        Arrays.sort(kane);
        int min = kane[N-1] - kane[0];
        for(int i=0;i<N-M+1;i++){
            int x = kane[N-1-i];
            int y = kane[N-M-i];
            int z = x-y;
            if(z==0){
                min = 0;
                break;
            }else if(min>z){
                min=z;
            }
        }

        System.out.println(min);

    }
}