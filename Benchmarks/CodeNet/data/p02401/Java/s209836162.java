import java.util.Scanner;

class Main{
   public void yatary() {  
     int x;
     Scanner sc = new Scanner(System.in);
     sc.useDelimiter("\\s");
     int a = sc.nextInt();
     String op = sc.next();
     int b = sc.nextInt();
       boolean sw = true;

       while(sw == true){
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