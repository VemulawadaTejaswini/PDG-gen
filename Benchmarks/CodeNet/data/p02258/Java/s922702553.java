import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] r = new int[n];
        for(int i = 0; i < n; i++){
            r[i]  = Integer.parseInt(sc.next());
        }
        
        int min = r[0];
        int max = -1000000000;
        for(int i = 1; i < n; i++){
            if(r[i] - min > max){
                max = r[i] - min;
            }
            if(r[i] < min){
                min = r[i];
            }
        }
        
        System.out.println(max);
    }
}
