import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
        String moji = "";
      
      int flag = 0;
      for(int i = 0;i < N;i++){
      	moji = in.next();
        if(moji.equals("Y")){flag=1;}
      }
        
      if(flag==1){System.out.print("Four");}
      else{System.out.print("Three");}

      }
	}