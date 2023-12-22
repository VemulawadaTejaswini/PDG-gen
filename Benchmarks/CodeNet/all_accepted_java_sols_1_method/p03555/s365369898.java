import java.util.*;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
 	  String s1=sc.next(),s2=sc.next();
      int y=0;
      for(int i=0; i<3; i++){
      	if(s1.charAt(i)==s2.charAt(2-i)){
        	y++;
        }
      }
      if(y==3){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}