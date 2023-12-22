import java.util.Scanner;

class Main {
    static public void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();

        int a,b,c,d;
        d = in % 10;
        in /= 10;
        c = in % 10;
        in /= 10;
        b = in % 10;
        in /= 10;
        a = in % 10;
        in /= 10;

        if(a+b+c+d == 7)
            System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
        else if(a+b+c-d == 7)
            System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
        else if(a+b-c+d == 7)
            System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
        else if(a+b-c-d == 7)
            System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
        else if(a-b+c+d == 7)
            System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
        else if(a-b+c-d == 7)
            System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
        else if(a-b-c+d == 7)
            System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
        else if(a-b-c-d == 7)
            System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");

    }
}
