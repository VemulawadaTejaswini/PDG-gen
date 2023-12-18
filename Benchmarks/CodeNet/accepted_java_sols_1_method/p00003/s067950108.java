
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while( scan.hasNextInt() ){
            int n = scan.nextInt();
            int a ;
            int b ;
            int d ;
            int c;
            int i ;
            
            for(i=0;i<n;i++){
                
           a = scan.nextInt();
            b = scan.nextInt();
             d = scan.nextInt();
                
             if((a*a)+(b*b)==(d*d)||(a*a)+(d*d)==(b*b)||(d*d)+(b*b)==(a*a)){
                 System.out.println("YES");
            }else{
                    System.out.println("NO");
            }
             
        }
    }
}
}
