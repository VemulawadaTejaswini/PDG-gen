import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = Integer.parseInt(sc.next());
        }
        
        int d = 0;
        int count = 1;
        for(int i = 0; i < n; i++){
            d += l[i];
            if(d <= x){
                count++;
            }
        }
        
        System.out.println(count);
    }
}