import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int a=kbd.nextInt();
    int b=kbd.nextInt();
      int c=kbd.nextInt();
        int d=kbd.nextInt();

    while(c>0&&a>0){
    c=c-b;
    a=a-d;
  }
int n=0;
    if(c<=0){
    n=0;
  }
  if(a<=0){
    n=1;
  }
  if(c<=0&&a<=0){
    n=0;
  }
  if(n==0){
    System.out.println("Yes");
}else{
    System.out.println("No");
}
}
}