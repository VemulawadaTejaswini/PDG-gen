import java.util.Scanner;
class Main {
	public static void main(String[] args){
		final int Number=100;
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int[] p=new int[N];
			for(int i=0;i<N;i++) p[i] = Integer.parseInt(sc.next());
			int max=p[1];
			int min=p[0];
			int diff=p[1]-p[0];
			for(int i=1;i<N;i++){
				boolean renew=false;
				if(min>p[i]){
					min=p[i];
					max=p[i];
					renew=true;
				}
				if(max<p[i])max=p[i];
				if(!renew){
					diff=Math.max(diff, max-min);
				}else{
					diff=Math.max(diff, p[i]-p[i-1]);
				}
			}
			
			System.out.println(diff);
		}
	}
}