import java.util.*;
public class Main {
    public static void main(String[] args){
      	int count=0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	int m = Integer.parseInt(sc.next());
      
      	//全通りを算出
      	int totalConbination=(n+m)*(n+m-1)/2;
      	
      	//奇数となる組み合わせ=偶数+奇数の組み合わせ
      	int oddConbination=n*m;
      
      	System.out.println(totalConbination-oddConbination);
      
      
    }

}