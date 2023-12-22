import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        
        int i = 0;
        while(true){
            if(i%2 == 0){
                c -= b;
            }else{
                a -= d;
            }
            if(a <= 0){
                System.out.println("No");
                break;
            }
            if(c <= 0){
                System.out.println("Yes");
                break;
            }
            i++;
        }
    }
}