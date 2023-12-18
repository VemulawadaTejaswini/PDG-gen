import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			int cnt = 0;
			int end = Math.min(n, 1000);
			for(int a=0;a<=end;a++){
				A:{
				for(int b=0;b<=end;b++){
					if(a+b>n){
						break A;
					}
					for(int c=0;c<=end;c++){
						int d = n-a-b-c;
						if(d>=0){
							cnt++;
						}
					}
				}
			}
			}
			System.out.println(cnt);
		}
	}
}