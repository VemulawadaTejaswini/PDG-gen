import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int K=sc.nextInt();
	int R=sc.nextInt();
	int S=sc.nextInt();
	int P=sc.nextInt();
	String T=sc.next();
	String[] T2=T.split("");
	long score=0;
	for(int i=0;i<N;i++) {
		if(i<K) {
			if(T2[i].equals("r")) {
				score+=P;
			}else if(T2[i].equals("s")){
				score+=R;
			}else if(T2[i].equals("p")){
				score+=S;
			}
		}else {
			if(T2[i-K].equals(T2[i])) {
				T2[i]="1";
					continue;
				}else {
			if(T2[i].equals("r")) {
				score+=P;
			}else if(T2[i].equals("s")){
				score+=R;
			}else if(T2[i].equals("p")){
				score+=S;
			}
		}
			}
	}
	System.out.println(score);
	}
}