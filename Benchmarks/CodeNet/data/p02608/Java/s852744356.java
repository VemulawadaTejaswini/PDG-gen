import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int max = 100000;
      	int count = 0;
      	int maxCount = 0;
      	int flag = 0;
      	Integer i = 1,j = 1,k = 1;
      	ArrayList<Integer> list = new ArrayList<>();
        for(i = 1;i < max;i++){
          for(j = 1;j < max;j++){
            for(k = 1;k < max;k++){
              list.add(i * i + j * j + k * k + i * j + j * k + i * k);
              if(flag == 0 &&i * i + j * j + k * k + i * j + j * k + i * k <= n){
              	maxCount++;
              }else{
                flag = 1;
              	max = maxCount;
              }
            }
			k = 1;
          }
		  j = 1;
        }
      	for(int cnt = 1;cnt <= n;cnt++){
        	System.out.println(Collections.frequency(list,cnt));
        }
    }
}
