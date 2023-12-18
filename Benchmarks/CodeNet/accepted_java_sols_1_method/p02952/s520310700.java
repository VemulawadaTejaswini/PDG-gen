public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		if(n>=10) {
			sum+=9;
			if(n>=1000) {
				sum+=900;
				if(n>=100000) {
					sum+=90000;
				}
				else {
					if(n>=10000) {
						sum+=n-10000+1;
					}
				}
			}else {
				if(n>=100) {
					sum+=n-100+1;
				}
			}
		}else {
			sum=n;
		}
		System.out.println(sum);
	}
}
