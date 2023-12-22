import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        String[] inputs = input.split(" ", 0);
        String[] inputs2 = input2.split(" ", 0);
        int teki = Integer.parseInt(inputs[0]);
        int lethal = Integer.parseInt(inputs[1]);
        long[] tekiArr = new long[teki];
        for(int i = 0; i < teki; i++){
            tekiArr[i] = Integer.parseInt(inputs2[i]);
        }
        long count = 0;
        Arrays.sort(tekiArr);
        for(int i = teki-1; i >= 0; i--){
            if(lethal > 0){
                lethal--;
                continue;
            }
            count += tekiArr[i];
        } 
        System.out.println(count);
    }
}