import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        char op = scan.next().charAt(0);
        int y = scan.nextInt();
        int ans = 0;
 
        while(op != '?'){
            switch(op){
                case '+':
                    ans = x + y;
                    break;
                case '-':
                    ans = x - y;
                    break;
                case '*':
                    ans = x * y;
                    break;
                case '/':
                    ans = x / y;
                    break;
            }

            System.out.println(ans);

            x = scan.nextInt();
            op = scan.next().charAt(0);
            y = scan.nextInt();
        }
    }
}