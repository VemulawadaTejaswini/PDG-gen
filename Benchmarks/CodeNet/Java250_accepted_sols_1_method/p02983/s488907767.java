import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int min = 2019 * 2019;
        R = Math.min(R, L + 2050);
        
        for(int i = L; i < R; i++){
            for(int j = i + 1; j <= R; j++){
                min = Math.min(min, ( (i % 2019) * (j % 2019) ) % 2019 );
            }
        }
        
        System.out.println( min );
        
    }
}
