import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	int k = sc.nextInt();
        int o=0;
      	for (int i=0;i<n;i++){
          int a=sc.nextInt();
        	if(a>=k)o++;
        }
      
		System.out.println(o);
	}
}