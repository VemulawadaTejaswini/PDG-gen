import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_of_list = sc.nextInt();
        int[] number_list = new int[num_of_list];
        for(int i = 0;i < num_of_list;i++){
            number_list[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i < 100;i++){
            int total = 0;
            for(int j = 0;j < num_of_list;j++){
                total += (number_list[j]-(i+1))*(number_list[j]-(i+1));
            }
            if(total<smallest){
                smallest = total;
            }
        }
        System.out.println(smallest);
    }
}