import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int a = scn.nextInt();
            String str = scn.next();
            int b = scn.nextInt();

            if(str.equals("?")) break;

            switch(str){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*" :
                    System.out.println(a * b);
                    break;
                case "/" :
                    System.out.println(a / b);
                    break;
            }
        }
    }
}
