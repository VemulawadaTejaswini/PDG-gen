import java.util.Scanner;

public class Main{
    public static void main(String [] args){
       
             Scanner scan = new Scanner(System.in);
        int m,f,r;
        
        while(true){
            m = scan.nextInt(); f = scan.nextInt(); r = scan.nextInt();
            int v = m + f;
            if (v >=80) {
                System.out.println("A");
            }
            else if(v >= 65 && v <80 ){
                 System.out.println("B");
            }
            else if(v >= 50 && v <65 ){
                 System.out.println("C");
            }
            else if(v >= 30 && v <50 ){
                if (r >= 50) {
                    System.out.println("C");
                }else if(m == -1 || f == -1){
                         System.out.println("F");
                  }else{
                    System.out.println("D");
                }
            }else if(v <30){
                    if (m<0 && f<0 && r<0) {
                          break;
                    }else if(m == -1 || f == -1){
                         System.out.println("F");
                     }
                    else{
                         System.out.println("F");
                    }
            }
            
            
        }
            
            
        
    }
}
