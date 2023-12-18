import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    for(int i=1;i<=5;i++)if(s.nextInt()==0){
      System.out.println(i);
      break;
    }

  }  
}