import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();//なんの倍数
      	int n =0;
      	int count=0;
      	boolean next=true;
      

      while(next=true){

        n=(n%k)*10+7;
      	count+=1;
        if((n%k)==0){//割り切れたら終了
          break;
        }
        if(count>=k){//余りが0にならない
          count=0;
          break;
        }
      }
     if(count==0) {
     	System.out.println(-1); 
     }else{
        System.out.println(count); 
     }
    } 
}








