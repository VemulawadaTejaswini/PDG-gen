import java.util.*;
public class Main10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int a = sc.nextInt();
    int a = 0;

    int i = 1;

    do{
	a = sc.nextInt();
         if(a == 0)
             break;
         if(i >= 10000){
             System.out.println("Too Large");
         }
	System.out.println("Case" + i + ":"  + a );
        i++;
    }while(a != 0);
    
    
    
   
   
   
  }

}