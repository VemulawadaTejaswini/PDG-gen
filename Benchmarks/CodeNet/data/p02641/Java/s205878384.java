import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
      	int n = sc.nextInt();
      	ArrayList<Integer> list = new ArrayList<>();
      	if(n == 0){
          System.out.println(x);
        }else{
        	for(int cnt = 0;cnt < n;cnt++){
                list.add(sc.nextInt());
            }
          	int min = x;
          	int max = x;
          	while(true){
            	min--;
              	max++;
              	if(list.indexOf(min) == -1){
                	System.out.println(min);
                  	break;
                }else if(list.indexOf(max) == -1){
                	System.out.println(max);
                  	break;
                }
            }
        }
	}
}