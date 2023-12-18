import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            char ki = sc.next().charAt(0);
            int b = sc.nextInt();
            int ck = 0;
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
            }else{
            	System.out.println("error");
            	ck = 1;
            }
            if(ck == 0){
                System.out.println(ans);
            }
        }
    }
}