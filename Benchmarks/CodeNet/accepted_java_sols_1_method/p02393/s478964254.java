                  
                
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        if (a<b) {
            if(b<C) {
                System.out.printf("%d %d %d\n", a,b,C);
            }else if(a < C) {
                System.out.printf("%d %d %d\n", a,C,b);
            }else {
                System.out.printf("%d %d %d\n", C,a,b); 
            }
        }else {
            
            if (a<C) {
                System.out.printf("%d %d %d\n", b,a,C);
            }else if(b<C) {
                System.out.printf("%d %d %d\n", b,C,a);
            }else {
                System.out.printf("%d %d %d\n", C,b,a);
                
            }                

         }
        sc.close();    

        }
            }

            


    

    
    
