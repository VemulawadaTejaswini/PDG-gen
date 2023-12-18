import java.util.Scanner;

class Main{
   public void yatary() {  
     Scanner sc = new Scanner(System.in);
     int x;
     int a = sc.nextInt();
 String op = sc.next();
     int b = sc.nextInt();
       boolean sw = true;
       sc.useDelimiter("\\s");
       while(sw = true){
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
        }
           sw = false;
     }
  }

public static void main(String[] args){ 
    new Main().yatary();   
  }
} 