import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if(a < b){
            c = a;
            a = b;
            b = c;
        }
        c = a%b;
        while(c != 0){
            a = b;
            b = c;
            c = a%b;
        }      
        System.out.println(b);         
    }
}

