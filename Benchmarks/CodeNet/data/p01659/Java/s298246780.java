import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(q.isEmpty()){
				q.push(a);
				cnt++;
			}else{
				while(!q.isEmpty()){
					int b = q.pop();
					if(b<=a){
						q.push(a);
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}	
}