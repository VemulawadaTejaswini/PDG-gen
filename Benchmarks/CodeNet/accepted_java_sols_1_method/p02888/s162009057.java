import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sum = 0;
        int[] list = new int[nums];
        for(int i = 0; i < nums; i++){
            int num =  sc.nextInt();
            list[i]= num;
        }
        Arrays.sort(list);
        for(int k = 0; k < list.length; k++){
            int a = list[k];
            for (int i = k+1; i < list.length ; i++) {
                int b = list[i];
                for (int j = i+1; j < list.length; j++) {
                   int c = list[j];
                   if(c < a + b){
                       sum++;
                   }else{
                       break;
                   }
                }
            }
        }
        System.out.println(sum);
    }
}
