import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
      	int a = sc.nextInt();
      	int b = sc.nextInt();
     	int c = sc.nextInt();
      	int k = sc.nextInt();
      
      	int count = 0;
      	boolean yon = false;
      
      	while(count <= k && !yon){
          if(b <= a) b *= 2;
          else if(c <= b) c *= 2;
          else yon = true;
          count++;
        }
      
      	if(yon) System.out.println("Yes");
        else System.out.println("No");
	}
}
