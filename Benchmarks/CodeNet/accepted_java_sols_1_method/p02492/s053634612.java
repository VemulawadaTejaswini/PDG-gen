import java.util.Scanner;
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        while(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
        	if(op.equals("+")){
        		System.out.println(a + b);
        	}else if(op.equals("-")){
        		System.out.println(a - b);
        	}else if(op.equals("*")){
        		System.out.println(a * b);
        	}else{
        		System.out.println(a / b);
        	}
        	a = sc.nextInt();
        	op = sc.next();
            b = sc.nextInt();
        }
	}
}