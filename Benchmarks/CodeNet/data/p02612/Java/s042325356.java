import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a%1000==0) System.out.println(0);
    else System.out.println(1000-a%1000);

  }  
}