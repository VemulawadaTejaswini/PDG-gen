import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a,b,c,r;
      Scanner  sc =new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      if (a<b) {
          c=a;
          a=b;
          b=c;
      }  
      r=a%b;
while(r!=0){
a=b;
b=r;
r=a%b;
}
System.out.println(b);
    }
}
