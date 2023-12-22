import java.util.Scanner;
 
 class Main {
    public static void main(String[] args){ 
        
         Scanner shuru = new Scanner(System.in);   

        
        int a = shuru.nextInt();
        
        int b = shuru.nextInt();
        int hhh = a;
        
        for( int i = 1;i <= hhh;i ++){

        int c = a > b ? a : b;
            int d = a < b ? a : b;

            a = c % d;
            b = d;

            if(a == 0) {
                System.out.println(d);
                return;
            }

        }


}
}
