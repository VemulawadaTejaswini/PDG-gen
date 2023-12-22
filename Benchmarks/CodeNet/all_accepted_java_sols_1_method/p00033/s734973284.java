import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, ball, a, b;
		int A[] = new int[10], B[] = new int[10];
		boolean answer[], done;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		answer = new boolean[num];
		for(int i=0;i<num;i++){
			a=0; b=0;
			A[0]=scan.nextInt(); B[0]=0;
			done=false;
			for(int j=1;j<10;j++){
				ball = scan.nextInt();
				if(done) continue;
				if(ball<A[a] && ball<B[b]){
					answer[i] = false;
					done = true;
				}
				else if(ball>A[a] && ball<B[b]){
					a++;
					A[a]=ball;
				}
				else if(ball<A[a] && ball>B[b]){
					if(b==0)b--;
					b++;
					B[b]=ball;
				}
				else{
					if(ball-A[a]>ball-B[b]){
						b++;
						B[b]=ball;
					}
					else{
						a++;
						A[a]=ball;
					}
				}
			}
			if(!done)answer[i]=true;
		}
		
		for(int i=0;i<num;i++){
			if(answer[i]) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}