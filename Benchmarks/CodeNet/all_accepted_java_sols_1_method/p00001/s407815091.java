import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int[] inputs = new int[10];

        for(int i = 0; i < 10; i++){
            inputs[i] = s.nextInt();
        }

        Arrays.sort(inputs);

        System.out.println(inputs[9]);
        System.out.println(inputs[8]);
        System.out.println(inputs[7]);
    }
}