import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String op;
    int a;
    int b;
    int sum = 0;
    int dec = 0;
    int multi = 0;
    int div = 0;

    do{
       
       a = sc.nextInt();
       op = sc.next();
       b = sc.nextInt();



    if(op.equals("+")){
       sum = a+b;
       System.out.println(sum);
    }else if(op.equals("-")){
       dec = a-b;
       System.out.println(dec);
    }else if(op.equals("*")){
       multi = a*b;
       System.out.println(multi);
    }else if(op.equals("/")){
      switch(b){
        case 0:
        break;
      default:
       div = a/b;
       System.out.println(div);
    }
  }
}while(!(op.equals("?")));




sc.close();
}

  }

