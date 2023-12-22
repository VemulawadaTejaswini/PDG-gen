import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        boolean flag = true;
        for(int i = 0; flag; i++){
            flag = false;
            for(int j = num - 1; j >= i + 1; j--){
                if(array[j - 1] > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    flag = true;
                    count++;
                }
            }
        }
        System.out.print(array[0]);
        for(int i = 1; i < num; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("\n" + count);
        
    }
}
