import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	int x,y;
	int copy = 0;
	
	   for(int i = 1; true; i++){
		   x = sc.nextInt();
		   y = sc.nextInt();
		   if(x == 0 && y == 0) break;
		   
		   else if(x > y){
			   copy = x;
			   x = y;
			   y = copy;
		   }
		   System.out.println(x + " " + y);
	   }
	sc.close();
	}
}

