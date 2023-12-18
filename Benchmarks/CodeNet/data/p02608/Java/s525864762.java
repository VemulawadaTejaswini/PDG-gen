import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = 20;
      	int count = 0;
      	int i = 1,j = 1,k = 1;
      	ArrayList<Integer> list = new ArrayList<>();
        for(i = 1;i * j * k < n;i++){
          for(j = 1;i * j * k < n;j++){
            for(k = 1;i * j * k < n;k++){
              list.add(i * i + j * j + k * k + i * j + j * k + i * k);
            }
			k = 1;
          }
		  j = 1;
        }
      	for(int cnt = 0;cnt < n;cnt++){
        	System.out.println(Collections.frequency(list,cnt));
        }
    }
}
