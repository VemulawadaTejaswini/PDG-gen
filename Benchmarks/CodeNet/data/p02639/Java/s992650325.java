import java.util.*;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
      	for (int i=0; i<5; i++){
			int n=sc.nextInt();
          	if (n==0){
              System.out.print(i+1);
              return;
            }
        }		
	}
}