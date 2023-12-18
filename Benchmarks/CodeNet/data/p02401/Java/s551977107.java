import java.util.Scanner;
 
public class Main{
  public static void main(String[] args) throuws IOException{
    while(true){
      Scanner obj = new Scanner(System.in);
      int a = obj.nextInt();
      char op = obj.next().charAt(0);
      int b = obj.nextInt();
     
      if(op == '+'){
        System.out.println(a + b);}
      else if(op == '-'){
        System.out.println(a - b);}
      else if(op == '*'){
        System.out.println(a * b);}
      else if(op == '/'){
        System.out.println(a / b);}
      else{
        break;}
    }
  }
}