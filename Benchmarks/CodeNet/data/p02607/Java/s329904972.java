import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
		int N = sc.nextInt();
      	int count = 0;
      	
      	for(int i = 1; i < N + 1; i ++){
           if(i%2 == 1 && sc.nextInt()%2 == 1){
           		count ++;
           }
        }
      	System.out.print(count);
    }
}