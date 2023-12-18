import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    for(int i=1;i<=5;i++){
      if(scn.nextInt()==0){
        System.out.println(i);
        return;
      }
    }
  }
}