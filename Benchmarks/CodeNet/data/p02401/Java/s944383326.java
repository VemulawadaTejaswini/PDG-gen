import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b,A;
    String op;
    String str1="+";
    String str2="-";
    String str3="*";
    String str4="/";
    String str5="?";
    a=scan.nextInt();
    op=scan.next();
    b=scan.nextInt();

    if(op.equals(str1)){
      A=a+b;
      System.out.println(A);
    }  else if(op.equals(str2)){
      A=a-b;
        System.out.println(A);
      }else if(op.equals(str3)){
        A=a*b;
      System.out.println(A);
    }else if(op.equals(str4)){
      A=(int)a/b;
      System.out.println(A);
    }else if(op.equals(str5)){
System.out.print("\n");
    }

  }
}

