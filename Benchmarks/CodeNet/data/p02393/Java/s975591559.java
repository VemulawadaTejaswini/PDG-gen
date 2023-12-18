import java.util.Scanner;
 
public class Main {
 
    static Scanner scan = new Scanner(System.in);
     
    public static void main(String[] args){
        int a,b,c;
        int tmp;
         
        a = scan.nextInt();
         b = scan.nextInt();
        c = scan.nextInt();
//      a = Integer.parseInt(args[0]);
//      b = Integer.parseInt(args[1]);
//      c = Integer.parseInt(args[2]);
 
         
         
        if(a > b){
 
            tmp = a;
            a = b;
            b = tmp;
        }if (a > c){
            tmp = a;
            a = c;
            c = tmp;
        }
        if(b > c){
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println(a+" "+b+" "+c);
     
    }
 
}

