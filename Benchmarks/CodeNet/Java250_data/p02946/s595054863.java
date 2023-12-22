import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> lo = new ArrayList<Integer>();
        int X = sc.nextInt();
        
        
        for(int i = 0; i < 2*(K-1)+1; i++) {
            System.out.print(X-K+1+i);
            if(i != 2*(K-1) )System.out.print(" ");
        }
        System.out.println("");

    }
}
