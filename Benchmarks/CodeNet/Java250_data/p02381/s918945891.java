import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        int num = sc.nextInt();
        if(num == 0) break;
        int[] array = new int[num];
        int sum = 0;
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double a = 0;
        for(int i = 0; i < num; i++){
            a += Math.pow(array[i] - sum / (double)num, 2);
        }
        a = a / (double)num;
        
        System.out.println(Math.sqrt(a));
        }
    }
}
