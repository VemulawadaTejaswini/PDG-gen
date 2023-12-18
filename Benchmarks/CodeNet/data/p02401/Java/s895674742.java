import java.util.*;	
class Main{	
    public static void main(String[] args){	
        Scanner input=new Scanner(System.in);	
        int a,b;	
        while(true){	
            a=input.nextInt();	
            char op = input.next().charAt(0);	
            b=input.nextInt();	
        if(op == '?')break;	
        else if (op == '+')	
            System.out.println(a + b);	
        else if ( op == '-')	
            System.out.println(a - b);	
        else if (op == '*')	
            System.out.println(a * b);	
        else if(op == '/')	
            System.out.println(a / b);	
        }	
    }	
}	
