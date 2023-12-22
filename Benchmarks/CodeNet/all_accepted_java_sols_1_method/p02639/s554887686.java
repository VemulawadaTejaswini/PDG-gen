import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner n = new Scanner(System.in);
    for(int i=1;i<=5;i++){
      if(n.nextInt()==0){
        System.out.println(i);
        break;
      }
    }
  }
}
      
      
