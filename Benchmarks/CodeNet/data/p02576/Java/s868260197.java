import java.util.*;

Class Takoyaki{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int X = sc.nextInt();
      	int T = sc.nextInt();
      	sc.close();
      
      	int res = Math.ceil(N/X) * T;
      	System.out.println(res);
    }
}