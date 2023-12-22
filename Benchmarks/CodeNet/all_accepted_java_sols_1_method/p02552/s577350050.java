import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	if( n == 1 ){
          n = 0;
        }else{
          n = 1;
        }
      	System.out.println(n);
	}
}