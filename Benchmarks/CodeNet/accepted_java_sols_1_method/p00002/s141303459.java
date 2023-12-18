import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while( scan.hasNextInt() ){
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        int i = 1;
        while(c / 10 > 0){
           c = c / 10;
                 i++;
        }   System.out.println(i);
            
            
        

    }
   }
}   


