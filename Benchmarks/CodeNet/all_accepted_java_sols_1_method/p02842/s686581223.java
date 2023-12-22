import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		
		int xx = (int)Math.floor((nn+1)/1.08);
		
		if((int)(xx * 1.08) == nn ){
			System.out.print(xx);
		}else{
			System.out.print(":(");
		}
	}
}