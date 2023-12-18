import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String args[]){
        int[] h = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            h[i] = Integer.parseInt(scan.next());
        }
        Arrays.sort(h);
        System.out.println(h[9]);
        System.out.println(h[8]);
        System.out.println(h[7]);
    }
}