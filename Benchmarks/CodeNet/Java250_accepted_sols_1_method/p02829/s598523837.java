

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if(a==1&&b==2 || b==1 &&a==2){
            System.out.println("3");
        } else if(a==1 && b == 3 || a==3&&b==1){
        System.out.println("2");
     } else if(a==2 && b==3||a==3&&b==2){
            System.out.println("1");
    }
    }
    
}
