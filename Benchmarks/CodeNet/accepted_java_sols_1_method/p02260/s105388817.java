import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int temp = 0, count = 0, minj = 0;
        for(int i = 0; i < num - 1; i++){
            minj = i;
            for(int j = i; j < num; j++){
                if(array[j] < array[minj]){
                    minj = j;
                }
            }
            temp = array[i];
            array[i] = array[minj];
            array[minj] = temp;
            if(i != minj){
                count++;
            }
        }
        System.out.print(array[0]);
        for(int i = 1; i < num; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("\n" + count);
    }
}
