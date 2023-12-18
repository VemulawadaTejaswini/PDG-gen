import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt()+sc.nextInt()-sc.nextInt()-sc.nextInt();
        if(a>0){
            System.out.println("Left");
        }else if(a<0){
            System.out.println("Right");
        }else{
            System.out.println("Balanced");
        }
    }
}
