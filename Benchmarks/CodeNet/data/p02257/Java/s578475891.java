import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, j, n = scanner.nextInt();
        int count = 0;
        int[] array = new int[n];
        for(i = 0; i < n; ++i) array[i] = scanner.nextInt();

        for(i = 0; i < n; ++i){
            int half = (int)(array[i]/2);
            for(j = 2; j <= half; ++j) if(array[i]%j == 0) break;
            if(j == half + 1 || array[i] == 2) ++count;
        } 
        System.out.println(count);
        scanner.close();
    }
}
