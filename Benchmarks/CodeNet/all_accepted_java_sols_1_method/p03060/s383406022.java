import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] value = new int[num];
        int[] cost = new int[num];
        for(int i=0; i<num; i++){
          value[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
          cost[i] = sc.nextInt();
        }
        int sum = 0;
        int sub = 0;
        for(int i=0; i<num; i++){
          sub = value[i] - cost[i];
          if(sub > 0) sum += sub;
        }
		System.out.println(sum);
	}
}