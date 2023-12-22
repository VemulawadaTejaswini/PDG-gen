import java.util.Scanner;

class Main{
   public void yatary() {  
     int x,a,b;
       String op;
     Scanner sc = new Scanner(System.in);
     sc.useDelimiter("\\s");

       boolean sw = true;

       while(sw == true){
           a = sc.nextInt();
           op = sc.next();
           b = sc.nextInt();
           if (op.equals("+")){
               x = a + b;
               System.out.println(x);
           }else if(op.equals("-")){
               x = a - b;
               System.out.println(x);
           }else if(op.equals("*")){
               x = a * b;
               System.out.println(x);
           }else if(op.equals("/")){
               x = a / b;    
               System.out.println(x);
           }else{
                sw = false;     
           }
       }
  }

public static void main(String[] args){ 
    new Main().yatary();   
  }
} 