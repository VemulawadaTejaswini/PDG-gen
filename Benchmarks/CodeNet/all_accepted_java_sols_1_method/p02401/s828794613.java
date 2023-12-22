import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);

      int a;
      int b;
      String op;


         while(true){

        	 a = stdIn.nextInt();
             op = stdIn.next();
             b = stdIn.nextInt();

             if (op.equals("?"))
        		 break;

             else if(op.equals("+"))
        		 System.out.println(a + b);

        	 else if(op.equals("-"))
        		 System.out.println(a - b);

        	 else if(op.equals("*"))
        		 System.out.println(a * b);

        	 else if(op.equals("/"))
        		 System.out.println(a / b);
         }
   }
}