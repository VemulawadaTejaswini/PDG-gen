import java.util.*;

class Main{
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
      	long a = sc.nextInt();	//１が書かれたカード
      	long b = sc.nextInt();	//０が書かれたカード
      	long c = sc.nextInt();	//-1が書かれたカード
      	long k = sc.nextInt();	//選ぶ枚数
      	long sum = 0;
      
      	if(a>=k){
          	sum = sum+1*k;
        }else{
          	sum = sum+1*a;
          	k = k-a;
            if(b>=k){
          		sum = sum+0*k;
        	}else{
         		sum = sum+0*b;
              	k = k-b;
                if(c>=k){
         			sum = sum+(-1)*k; 
        		}else{
         			sum = sum+(-1)*c;
        		}
      		}
        }
      
      	System.out.println(sum);
      
    }
}