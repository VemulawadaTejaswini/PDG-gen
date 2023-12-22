import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      int[] answer;
      int count   = 0;
      answer      = new int[100];
      Scanner sc  = new Scanner(System.in);

          while(true){
              int    a      = sc.nextInt();
              String op     = sc.next();
              int    b      = sc.nextInt();
              answer[count] = 0;

              if(op.equals("?"))
                    break;

              switch(op){
                    case "+":
                        answer[count] = a+b;
                        break;
                    case "-":
                        answer[count] = a-b;
                        break;
                    case "*":
                        answer[count] = a*b;
                        break;
                    case "/":
                        if(b == 0)
                            break;
                        answer[count] = a/b;
                        break;
                    default:
                        break;
              }
              count++;
          }

          for(int i=0; i<count; i++){
            System.out.printf("%d\n", answer[i]);
          }
  }
}

