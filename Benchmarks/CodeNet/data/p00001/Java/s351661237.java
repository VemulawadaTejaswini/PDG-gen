import java.util.*;

public class Main{
	public static void main(String[] args){
		int[] height = new int[10];
		int[] rank = new int[3];
		int i;
		Scanner scanner = new Scanner(System.in);

		for(i=0;i<10;i++){
			height[i] = scanner.nextInt();
			if(height[i]>=rank[0]){
				rank[2]=rank[1];
				rank[1]=rank[0];
				rank[0]=height[i];
			}else if(height[i]>=rank[1]){
				rank[2]=rank[1];
				rank[1]=height[i];
			}else if(height[i]>=rank[2]){
				rank[2]=height[i];
			}
		}

		for(i=0;i<3;i++){
			System.out.println(i+1+"番目に高い山の高さ "+rank[i]);
		}
	}
}

