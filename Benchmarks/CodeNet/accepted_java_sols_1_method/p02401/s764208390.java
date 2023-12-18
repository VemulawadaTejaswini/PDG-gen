import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a,b;
        String op;
        while(true){
            a=scan.nextInt();
            op=scan.next();
            b=scan.nextInt();
            switch(op){
                case "?":
                    System.exit(0);
                    break;
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
            }
        }
   }
}
