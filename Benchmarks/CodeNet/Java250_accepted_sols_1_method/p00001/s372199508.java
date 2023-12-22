import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        for(int i = input.length; i > input.length-3; i--){
            System.out.println(input[i-1]);
        }
    }
}