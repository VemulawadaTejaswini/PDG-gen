import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int worker_number = sc.nextInt();
        int[] worker_number_counter = new int[worker_number];

        for(int i = 0;i < worker_number-1;i++){
            worker_number_counter[sc.nextInt()-1] += 1;
        }
        for(int i : worker_number_counter){
            System.out.println(i);
        }
    }
}