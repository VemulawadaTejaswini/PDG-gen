import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int a,b,answer;
        String op;
    	//?¨??????\??????????????????????????§????????????
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			a  = scanner.nextInt();
			op = scanner.next();
			b  = scanner.nextInt();
			
			if(op.equals("+")){
				System.out.println(a+b);
			}
			else if(op.equals("-")){
				System.out.println(a-b);
			}
			else if(op.equals("*")){
				System.out.println(a*b);
			}
			else if(op.equals("/")){
				System.out.println(a/b);
			}
			else{
				break;
			}
		}
    	scanner.close();
    }
}