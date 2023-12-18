import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            char ki = sc.next().charAt(0);
            int b = sc.nextInt();
            int ans = 0;
            if(ki == '?'){
            	break;
            }else if(ki == '+'){
            	ans = a + b;
            }else if(ki == '-'){
            	ans = a - b;
            }else if(ki == '*'){
            	ans = a * b;
            }else if(ki == '/'){
            	ans = a / b;
            }
            System.out.println(ans);
        }
    }
}