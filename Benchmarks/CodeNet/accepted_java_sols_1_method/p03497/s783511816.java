import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();
        int[] counts = new int[200001];

        // input
        int num = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 0; i < num; i++){
            counts[scan.nextInt()] += 1;
        }
        for(int i = 0; i < 200001; i++){
            if(counts[i] != 0){
                nums.add(counts[i]);
            }
        }

        // search
        Collections.sort(nums, Comparator.reverseOrder());
        for(int i = 0; i < k; i++){
            nums.poll();
        }
        int sum = 0;
        while(nums.size() > 0){
            sum += nums.poll();
        }

        // answer
        System.out.println(sum);


    }
}