import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int manth = Integer.parseInt(sc.next());
    int day = Integer.parseInt(sc.next());
    int takahasi = 0;
   
    if(manth<=day) takahasi = manth;
    else takahasi = manth-1;
    
    System.out.println(takahasi);
  }
}