import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int nb = (b*1);
        int na = (n*a);
        if(na <= nb){
            System.out.println(na);
        }else{
            System.out.println(nb);
        }
            
            
    }
    
}