import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] nums = new int[NUM];
        int k = scan.nextInt();
        for(int i = 0; i < NUM; i++){
            nums[i] = scan.nextInt();
        }

        // calc
        int count = 0;
        for(int i = 0; i < NUM;){
            if(i == 0){
                count++;
                i += k;
            } else {
                count++;
                i += k - 1;
            }
        }

        // answer
        System.out.println(count);

    }
}