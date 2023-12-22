import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int people = scan.nextInt();
        final int FOODS = scan.nextInt();
        int[] value = new int[FOODS];
        for(int i = 0; i < people; i++){
            int temp = scan.nextInt();
            for(int j = 0; j < temp; j++){
                value[scan.nextInt() - 1] += 1;
            }
        }

        // search
        int count = 0;
        for(int i = 0; i < FOODS; i++){
            if(value[i] == people){
                count++;
            }
        }

        // answer
        System.out.println(count);

    }
}