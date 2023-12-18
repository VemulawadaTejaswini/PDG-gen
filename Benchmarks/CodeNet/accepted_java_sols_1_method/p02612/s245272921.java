import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      	int a = sc.nextInt();
      
      	a %= 1000;
      	if(a == 0) a = 1000;
     
        System.out.println(1000 - a);
        
	}
}