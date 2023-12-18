import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[4];
		
		boolean go = true;

		while(sc.hasNext()){
			int[] n = new int[3];
			for(int i=0;i<3;i++){
				n[i] = sc.nextInt();
			}
			Arrays.sort(n);
			if(n[0]+n[1]<=n[2])go=false;
			if(go==true){
				if(n[0]*n[0] + n[1]*n[1] == n[2]*n[2]){
					num[1]++;
				}else if(n[0]*n[0] + n[1]*n[1] > n[2]*n[2]){
					num[2]++;
				}else if(n[0]*n[0] + n[1]*n[1] < n[2]*n[2]){
					num[3]++;
				}
				num[0]++;
			}
		}
		System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3]);
	}
}