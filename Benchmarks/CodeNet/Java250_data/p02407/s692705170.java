import java.util.*;

public class Main{
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        
        num = scanner.nextInt();

        int[] array;
        array = new int[num];

        for(int i = 0; i < num; i++){
            array[num - 1 - i] = scanner.nextInt();
        }

        for(int i = 0; i < num - 1; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println(array[num - 1]);

        scanner.close();
    }
}
