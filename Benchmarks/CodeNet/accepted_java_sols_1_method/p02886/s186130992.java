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
        for(int k = 0; k < list.length; k++){
            for (int i = k+1; i < list.length ; i++) {
                sum += list[k] * list[i];
            }
        }
        System.out.println(sum);
    }
}