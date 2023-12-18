import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number; i++){
            array[i] = scan.nextInt();
        }
        for(int t = number-1; t >= 0; t--){
            System.out.print(array[t]);
            if(t > 0){
                System.out.print(' ');
            }
        }
        
        System.out.print("\n");
    }
}


