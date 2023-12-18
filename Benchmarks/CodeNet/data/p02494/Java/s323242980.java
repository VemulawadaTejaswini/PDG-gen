import java.util.Scanner;
public class Main {
   public static void main(String[] args){
	   Scanner buf = new Scanner(System.in);
	   int h,w;
	   while(true){
		   h = buf.nextInt();
		   w = buf.nextInt();
		   if(h == 0 && w == 0) break;
		   for(int i=0;i<h;i++){
			   for(int j=0;j<w;j++) System.out.print('#');
			   System.out.println();
		   }
	   }
   }
}