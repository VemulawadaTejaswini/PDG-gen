import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){   
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ans = a+b;
            if(ans<10){
                System.out.println("1");
            }
            if(ans<100 && ans>9){
                System.out.println("2");
            }
            if(ans<1000 && ans>99){
                System.out.println("3");
            }
            if(ans<10000 && ans>999){
                System.out.println("4");
            }
            if(ans<100000 && ans>9999){
                System.out.println("5");
            }
            if(ans<1000000 && ans>99999){
                System.out.println("6");
            }
            if(ans<10000000 && ans>999999){
                System.out.println("7");
            }
        }
    }
 
}