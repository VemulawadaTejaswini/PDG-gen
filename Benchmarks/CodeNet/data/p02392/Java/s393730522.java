import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanenr s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a < b){
            if(b < c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
