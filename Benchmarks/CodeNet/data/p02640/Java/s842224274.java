import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int y=scn.nextInt();
    
    for(int i=0;i<=x;i++){
        if(i*2+(x-i)*4==y){
          System.out.println("Yes");
          return;
        }
    }
    System.out.println("No");
  }
}