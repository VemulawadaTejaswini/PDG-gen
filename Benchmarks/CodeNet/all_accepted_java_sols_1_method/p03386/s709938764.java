import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
      	//数値の入力
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int k = scn.nextInt();
      	//重複する場合
      	if(k>(a+b)/2-a){
        	for(int i=0; i<b-a+1; ++i){
				System.out.println(a+i);
			}
        }else if(a==b){
          System.out.println(a);
        }else{
          	//重複しない場合
         	for(int i=a; i<=a+k-1; ++i){
				System.out.println(i);
			}
          	for(int i=b-k+1; i<=b; ++i){
				System.out.println(i);
			}
        }
	}
}