import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
       int kazu=sc.nextInt();
       System.out.println(1000-(kazu%1000));
}
}
