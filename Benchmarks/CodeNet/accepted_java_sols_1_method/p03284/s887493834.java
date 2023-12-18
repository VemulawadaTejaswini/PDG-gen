import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); //枚数
    int k = scanner.nextInt(); //人数
    
    int result = 1;
    
    if(n%k==0){
      result = 0;
    }
    
    System.out.println(result);
    
	}
}