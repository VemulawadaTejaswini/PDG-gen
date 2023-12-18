import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =1;
		boolean bool = true;
		boolean status=false;
		boolean b = false;
		if (N==1||N==2) {
			System.out.println(1);
			return ;
		}
		int a = 0;
		for (int i=0;i<N;i++) {
			int t = sc.nextInt();
			if (b==false) {
				a = t;
				b = true;
			} else {
				if (status ==false) {
					if (a>t) {
						bool= true;
						status = true;
					}else if (a<t) {
						bool= false;
						status = true;
					}
				} else {
					if (bool==true&&a<t) {
						status = false;
						count ++;
					} else if (bool==false&&a>t) {
						status = false;
						count ++;
					}
				}
				a=t;
			}
		}
		System.out.print(count);
	}
}