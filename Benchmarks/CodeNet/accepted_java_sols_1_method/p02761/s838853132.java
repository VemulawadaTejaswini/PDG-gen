import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		for(int i=0;i<M;i++){
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int minVal;
		if(N==1){
			minVal = 0;
		}else{
			minVal = (int)Math.pow(10,N-1);
		}
		for(int i=minVal;i<(int)Math.pow(10,N);i++){
			String tmp = String.valueOf(i);
			boolean exist = true;
			for(int j=0;j<M;j++){
				if(!tmp.substring(s[j]-1,s[j]).equals(String.valueOf(c[j]))){
					exist = false;
					break;
				}
			}
			if(exist){
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}
}