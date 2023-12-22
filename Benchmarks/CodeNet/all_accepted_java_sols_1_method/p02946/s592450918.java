import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		// スペース区切りの整数の入力
		int x = sc.nextInt();
       	int start = x-k+1;
      	int end = x+k-1;
      	if(start<-1000000){
          start=-1000000;
        }
      	if(end>1000000){
          end=1000000;
        }
     for(int i=start;i<=end;i++){
       System.out.print(i + " ");
    }
    }
}