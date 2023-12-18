import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, j, n = scanner.nextInt();
        int count = 0;
        
        for(i = 0; i < n; ++i){
            int input = scanner.nextInt();
            int half = (int)(input/2);
            for(j = 2; j <= half; ++j) if(input%j == 0) break;
            if(j == half + 1 || input == 2) ++count;
        } 
        System.out.println(count);
        scanner.close();
    }
}
