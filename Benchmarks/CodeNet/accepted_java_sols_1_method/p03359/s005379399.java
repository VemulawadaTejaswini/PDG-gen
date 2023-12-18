import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// 整数の入力
		int a = sc.nextInt();
    int b = sc.nextInt();
    int cnt= 0;
		int i=0,j=0;
			for(i=1; i<= a; i++){
      	if(i!=a){
        	for(j=1; j<=31;j++){
            if(i==j){
              cnt=cnt+1;
            	}
        	}
      	}else if(i==a){
        	for(j=1; j<=b;j++){
            if(i==j){
              cnt=cnt+1;
            }
        }
    }
    }
  System.out.println(cnt);
	}
}
