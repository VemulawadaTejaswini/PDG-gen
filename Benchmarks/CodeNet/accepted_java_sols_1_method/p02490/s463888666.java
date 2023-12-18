import java.util.*;
public class Main {
   public static void main(String[] args){
	   Scanner buf = new Scanner(System.in);
	   int i,j;
	   while(true){
		   i = buf.nextInt();
		   j = buf.nextInt();
		   if(i == 0 && j == 0) break;
		   if(i < j) System.out.println(i + " " + j);
		   else if(i >= j) System.out.println(j + " " + i);
	   }
   }
}