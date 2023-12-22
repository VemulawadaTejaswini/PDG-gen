import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int dmy = scan.nextInt();
        final int query = scan.nextInt();
        char[] input = scan.next().toCharArray();
        int[] counts = new int[100002];
        int count = 0;
        for(int i = 1; i < input.length; i++){
            if(input[i - 1] == 'A' && input[i] == 'C'){
                count++;
            }
            counts[i] = count;
        }
        
        // answer
        int[] answer = new int[query];
        for(int i = 0; i < query; i++){
            int left = scan.nextInt();
            int right = scan.nextInt();
            answer[i] = counts[right-1] - counts[left-1];
        }

        for(int i = 0; i < query; i++){
            System.out.println(answer[i]);
        }

    }
}