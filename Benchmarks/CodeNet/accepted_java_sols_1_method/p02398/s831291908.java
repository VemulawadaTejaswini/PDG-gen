import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x;
        int y = 0;
        for(x = a;x <= b;x++){
        if(c % x == 0){
           y++; 
        }
        }
        System.out.println(y);
        
       
      
            
               
                
            
            
           
       
      

        }

    }
