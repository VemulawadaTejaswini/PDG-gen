//keshavs first usaco solve :)
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
      	int as = sc.nextInt();
      	int sum = 0;
      	for(int i = 0 ; i<as; i++) 
        {
          sum+= sc.nextInt();
        }
      	if(total-sum >= 0){
         System.out.println(total-sum); 
          
        }
      	else{
         System.out.println(-1); 
        }
	}
 
}