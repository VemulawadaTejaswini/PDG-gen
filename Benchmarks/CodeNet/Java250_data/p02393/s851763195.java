import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int a = stdId.nextInt(); 
		 int b = stdId.nextInt();
		 int c = stdId.nextInt();
     int[] num = {a,b,c};
     Arrays.sort(num);
     System.out.println("" + num[0] + " " + num[1] + " " + num[2]);
  }
}