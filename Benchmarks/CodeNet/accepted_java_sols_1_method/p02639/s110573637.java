import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);int j;
    for(int i=0;i<=4;i++){
       j =sc.nextInt();
      if(j==0){System.out.println(i+1);System.exit(0);}
    }
  }
}