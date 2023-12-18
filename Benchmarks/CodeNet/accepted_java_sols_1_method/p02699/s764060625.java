import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int  n=kbd.nextInt();
  int  w=kbd.nextInt();
  if(n>w){
    System.out.println("safe");
  }else{
    System.out.println("unsafe");
  }
}
}

