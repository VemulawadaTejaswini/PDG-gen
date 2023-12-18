import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        if(y>=x*2 && y<= x*4 && y%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}