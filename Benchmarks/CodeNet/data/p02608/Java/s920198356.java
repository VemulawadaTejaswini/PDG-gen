import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int count = 0,jc = 1,jk = 1;
      	for(int cnt = 0;cnt < n;cnt++){
        	for(int i = 1;i * jc * jk < cnt;i++){
            	for(int j = 1;i * j * k < cnt;j++){
                	for(int k = 1;i * j * k < cnt;k++){
                    	if(i * j * k == n){
                        	count++;
                        }
                    }
                }
            }
          	System.out.println(count);
          	count = 0;
        }
    }
}
