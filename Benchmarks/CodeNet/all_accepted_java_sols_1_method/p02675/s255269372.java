import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<1000) {
        int iti=n%10;
        
        switch(iti) {
         case 2:
         case 4:
         case 5:
         case 7:
         case 9:
        	 
        	 System.out.println("hon");
        	 
        	 break;
        	 
         case 0:
         case 1:
         case 6:
         case 8:
        	 
        	 System.out.println("pon");
        	 break;
        	 
         default:
        	 System.out.println("bon");
        }
      }
	}
}
	
