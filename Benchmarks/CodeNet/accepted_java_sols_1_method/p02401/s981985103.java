import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            
            if(op.equals("?")){
                break;
            }
            else if(op.equals("+")){
                x = a + b;
            }
            else if(op.equals("-")){
                x = a - b;
            }
            else if(op.equals("*")){
                x = a * b;
            }
            else if(op.equals("/")){
                x = a / b;
            }
            System.out.println(x);
        }
        
    }
}


