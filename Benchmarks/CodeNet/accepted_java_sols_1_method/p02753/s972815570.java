import java.util.*;
class Main{
	public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      String n = in.nextLine();
      int c =0, d=0;
      for(int i = 0 ; i < n.length() ; i++){
      	if(n.charAt(i)=='A')
          c++;
        else if(n.charAt(i)=='B')
          d++;
      }
      if(c==2)
        System.out.println("Yes");
      else if(d==2)
         System.out.println("Yes");
      else
         System.out.println("No");
    }
}