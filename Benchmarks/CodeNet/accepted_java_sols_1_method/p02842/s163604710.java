import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        for(int i = 1; i <= 50000; i++){
            int a = (int) (i * 1.08);
            if(a == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}