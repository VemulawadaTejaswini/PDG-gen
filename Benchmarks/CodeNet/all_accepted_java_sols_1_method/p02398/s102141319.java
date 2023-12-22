import java.util.*;

class Main{
	public static void main(String[] args){
		int s[]=new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<s.length;i++){
			s[i]= sc.nextInt();
		}
		int a = s[0];
		int b = s[1];
		int c = s[2];
		int cnt = 0;
		for(int i = a; i <= b; i++){
			if((c % i) == 0){
				cnt++;
			}
		}
				
		System.out.println(cnt);
	}
}