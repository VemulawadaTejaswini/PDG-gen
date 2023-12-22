import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//入力値
      	int n = sc.nextInt();
      	//配列
      	int a[] =new int[n];
     	
     	//入力値を配列に格納
      	for(int i=0;i<n;++i){
          a[i] = sc.nextInt();
        }
      	//カウントする
      	int count = 0;
      	for(int i=0;i<n;i++){
        	while(a[i]%2==0){
            	a[i] = a[i]/2;
         	 	count++;
            }
        }
      System.out.print(count);
      
    }
}