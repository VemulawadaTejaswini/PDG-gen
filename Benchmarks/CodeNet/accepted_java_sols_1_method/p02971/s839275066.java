import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[] buf=new int[N];
	for(int i=0;i<buf.length;i++){
		buf[i]=sc.nextInt();
	}


	int max=buf[0];
	int second=0;
	int num=0;

		for(int i=1;i<N;i++) {
			if(max<buf[i]) {
				second=max;
				max=buf[i];
				num=i;
			}else if(second<buf[i]){
				second=buf[i];
			}


		}
		for(int i=0;i<N;i++) {
			if(i==num) {
				System.out.println(second);
			}else {
				System.out.println(max);
			}
		}
	}

}