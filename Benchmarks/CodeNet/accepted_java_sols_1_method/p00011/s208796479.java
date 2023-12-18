
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int[] values = new int[w];
        for(int i = 0; i < w; i++){
            values[i] = i+1;
        }
        for(int i = 0; i < n; i++){
            String string = scanner.next();
            String[] ab = string.split(",");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;
            int temp = values[a];
            values[a] = values[b];
            values[b] = temp;
        }
        for(int i = 0; i < w; i++){
            System.out.println(values[i]);
        }
        scanner.close();
    }
     
    

}
