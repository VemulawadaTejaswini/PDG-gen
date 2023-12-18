import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int total=sc.nextInt();
      int totalleg=sc.nextInt();
      int turu=total;
      int kame=0;
      int cnt=0;
      while(kame<=total){
         if((kame*4+turu*2)==totalleg){
            cnt++;
         }
         turu--;
         kame++;
      }
      if(cnt>0){
         System.out.println("yes");
      }else{
         System.out.println("no");
      }
   }
}
      
      
