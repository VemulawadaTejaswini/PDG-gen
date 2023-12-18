import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   char []s = sc.next().toCharArray();
	   int temp = -1;
	   	   
	   for(int i = 0; i < s.length; i++) {
		 if(i % 2 == 0) {
			 if(s[i] !='R'&&s[i] !='U'&&s[i] !='D'){
				temp = 0;	 
				 break;
		 }
		}
		 if(i % 2 == 1) {
			 if(s[i] !='L'&&s[i] !='U'&&s[i] !='D'){
				 temp = 0;
					 break;
		 }
			 
	   }
		 }
	   if(temp == -1) {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
	   }
	   
	}
	}
