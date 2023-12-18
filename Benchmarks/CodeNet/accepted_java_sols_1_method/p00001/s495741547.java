import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] hight_list = new int[10];

        for(int i = 0; i < 10; i++){
            hight_list[i] = sc.nextInt();
        }

        Arrays.sort(hight_list);

        for(int i = 9; i > 6; i--){
            System.out.println(hight_list[i]);
        }

    }
}