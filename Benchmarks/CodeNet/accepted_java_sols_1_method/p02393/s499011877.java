import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a<b){
            if(b<c) System.out.println(a + " " + b + " " + c);
            else if(c<a) System.out.println(c + " " + a + " " + b);
            else System.out.println(a + " " + c + " " + b);
        }
        if(b<a){
            if(a<c) System.out.println(b + " " + a + " " + c);
            else if(c<b) System.out.println(c + " " + b + " " + a);
            else System.out.println(b + " " + c + " " + a);
        }
    }
}
