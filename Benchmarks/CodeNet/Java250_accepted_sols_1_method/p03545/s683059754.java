import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A = Integer.parseInt(s.substring(0,1));
		int B = Integer.parseInt(s.substring(1,2));
		int C = Integer.parseInt(s.substring(2,3));
		int D = Integer.parseInt(s.substring(3,4));
		int[] list = {A,B,C,D};

		for(int i=0; i<1<<3;i++) {
			boolean[] ae = new boolean[3];
			for(int j=0; j<3; j++) {
				if((1& i>>j) == 1) {
					ae[j] = true;
				} else {
					ae[j] = false;
				}
			}
			int total = 0;
			String ans = "";
			for(int m=0;m<list.length;m++) {
				if(m==0) {
					total += list[m];
					ans += list[m];
					continue;
				}
				if(ae[m-1]) {
					total += list[m];
					ans += "+"+list[m];
				} else {
					total -= list[m];
					ans += "-"+list[m];
				}
			}
			if(total == 7) {
				System.out.println(ans+"=7");
				return;
			}
		}

	}
}
