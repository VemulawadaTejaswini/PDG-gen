import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        
        if(A<1200){
            System.out.println("ABC");
        }else if(A<2800){
            System.out.println("ARC");
        }else{
            System.out.println("AGC");
        }
    }
}