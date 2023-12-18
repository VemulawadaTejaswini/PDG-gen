import java.util.*;
class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int i=1;
    for(i=1;i<=5;i++){
      if(input.nextInt()==0)
        break;
    }
    System.out.println(i);
  }
}