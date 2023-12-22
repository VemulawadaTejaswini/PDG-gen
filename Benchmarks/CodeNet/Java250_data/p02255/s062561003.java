import java.util.Scanner;

public class Main{
    
    static void putArray(int[] array){
        System.out.print(array[0]);
        for(int i = 1; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        
        putArray(array);
        
        for(int i = 1; i < array.length; i++){
            int v = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > v){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = v;
            putArray(array);
        }
        
        
    }
}
