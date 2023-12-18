import java.util.Scanner;

class Main{
private static String num;
private static int a,b;
    
  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
while(true){
a=s.nextInt();
 num = s.next();
b=s.nextInt();

if(num.equals("?")){
    
    break;
}

switch(num){
    
    case "+":
        System.out.println(a+b);
        break;
    case "-":
        System.out.println(a-b);
        break;
    case "*":
        System.out.println(a*b);
        break;
    case "/":
        System.out.println(a/b);
        break;
    
    
    
}
    
}
}
}
