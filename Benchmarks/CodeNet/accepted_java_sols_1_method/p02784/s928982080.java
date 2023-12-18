import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		// スペース区切りの整数の入力
		int n = sc.nextInt();
		int a =0;
      
      	for(int i=0;i<n;i++){
          a = a + sc.nextInt();
        }
     	 // 出力
     	if(a>=h){
          System.out.println("Yes");
        }
      	else{
		  System.out.println("No");
      	
        }
	}
}
