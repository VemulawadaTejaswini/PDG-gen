import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x;
        
        if(a < b){
            if(c < b){ 
                x = b;
                b = c;
                c = x;
                if(b < a){
                    x = b;
                    b = a;
                    a = x;
                }
            }
        }else{
            x = b;
            b = a;
            a = x;
            if(c < b){ 
                x = b;
                b = c;
                c = x;
                if(b < a){
                    x = b;
                    b = a;
                    a = x;
                }
            }
            
        }
        System.out.println(a +" "+ b +" "+ c);
        
    }
}
