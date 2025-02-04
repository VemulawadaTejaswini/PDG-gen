import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		long answer=0;
		char[] input=s.toCharArray();
		
		for(int mask=0;mask<(1<<n-1);mask++){
			StringBuilder sb=new StringBuilder();
			long sum=0;
			for(int i=0;i<n;i++){
				sb.append(input[i]);
				
				if((mask & (1<<i)) !=0){
					sum+=Long.parseLong(sb.toString());
					sb.setLength(0);
				}
			}
			
			if(sb.length()!=0){
				sum+=Long.parseLong(sb.toString());
			}
			
			answer+=sum;
		}
		System.out.println(answer);
	}
}
