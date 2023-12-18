import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int a = sc.nextInt();
    int a = 0;

    int i = 1;

    do{
	a = sc.nextInt();
	
        System.out.println("Case" + i + ":"  + a );

        i++;
    }while(a != 0);
       
   
  }

}