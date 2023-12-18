import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int max = array[1] - array[0];
        for(int i = 1; i < num; i++){
            for(int j = 0; j < i; j++){
                int dif = array[i] - array[j];
                if(max < dif){
                    max = dif;
                }
            }
        }
        int max = -2000000000;
        int min = array[0];
        for(int i = 1; i < num; i++){
            if(max < array[i] - min){
                max = array[i] - min;
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(max);
    }
}
