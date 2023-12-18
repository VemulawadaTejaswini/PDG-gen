import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int f = scan.nextInt();
        int b = scan.nextInt();
        
        
        
        
        
        if(b-m>=0 && b<=m+f){
            System.out.println(b-m);
        }else if (m>=b){
            System.out.println(0);
        }else if(b>=m+f){
              System.out.println("NA");
        
        
            
        
        
        
        }
        
        
       
    }
}

