import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 1; i < num; i++){
            int v = a[i];
            int j = i - 1;
            while(j >= 0 && array[j] > v){
                array[j] = array[j + 1];
                j--;
            }
            array[j + 1] = v;
        }
    }
}
