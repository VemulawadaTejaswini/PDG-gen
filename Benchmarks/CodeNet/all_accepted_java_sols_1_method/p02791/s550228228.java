import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] P = new int[N];
        int count = 1;
        for(int i = 0; i<N; i++){
            P[i] = scanner.nextInt();
        }
        
        int min = P[0];
        
        for(int j =1; j<N; j++){
            if(min>P[j]){
                count++;
                min = P[j];
            }
        }
        
        System.out.println(count);
        
    }    
}