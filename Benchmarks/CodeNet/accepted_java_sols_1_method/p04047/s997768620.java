import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kusi = scan.nextInt()*2;
        int[] niku = new int[kusi];
        for (int i = 0; i < kusi; i++){
            niku[i] = scan.nextInt();
        }

        //sort
        Arrays.sort(niku);
        //2つのうち小さいほうにそろえる
        int sum = 0;
        for (int i = 0; i < kusi; i+=2){
            sum += niku[i];
        }

        System.out.println(sum);
    }
}