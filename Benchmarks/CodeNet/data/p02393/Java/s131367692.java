import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int c = scan.nextInt();
     int x = 0;
     int y = 0;
     int z = 0;
     
     
     if( a == b){
         x = a;
         y = b;
         z = c;
         if(b >c){
             x = c;
             y = a;
             z = b;
         }
     }else if(b == c){
         x = a;
         y = b;
         z = c;
         if(a>b){
             x =b;
             y =c;
             z =a;
         }
     }else if(a == c){
         x = a;
         y = c;
         z = b;
         if(a>b){
             x =b;
             y =c;
             z =a;
         }
     }else if( a > b ) {
        x = b;
        y = a;
        z = c;
        if(a>c){
            x = b;
            y = c;
            z = a;
            if(b>c){
                x = c;
                y = b;
                z = a;
            }else if(a>b){
                    x = c;
                    y = a;
                    z = b;
                    if(a>b){
                        x = b;
                        y = c;
                        z = a;
                    }
            }
        }
     }else{
        x = a;
        y = b;
        z = c;
        if(b >c){
            x = a;
            y = c;
            z = b;
            if(a>c){
                x = c;
                y = a;
                z = b;
            }else if(b>a){
                x=c;
                y=b;
                z = a;
            }
        }
     }
     System.out.println(x+" "+ y +" "+z);
    }
}
