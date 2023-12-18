import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String  b = scanner.next();
        scanner.close();
        int c = Integer.parseInt(a+b);
        
        int i = 2;
        boolean heiho = false;
        while (i*i<=c){
         
            if(c == i*i){
                heiho = true;
                System.out.println("Yes");
            }   
            i++;
        
        }
            if(heiho == false){    
                 System.out.println("No");
            }
    }
}