class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		long nowplace = X;

		if (X>0) {
			boolean flag = true;
			int count = 0;
			while (flag) {
				if (count>K) {
					break;
				}
				nowplace-=D;
				if (nowplace<0) {
					flag = false;
				}
				count++;
			}
			if (count==K) {
				System.out.println(Math.abs(nowplace));
			} else if ((K-count)%2==0) {
				System.out.println(Math.abs(nowplace));
			} else {
				System.out.println(Math.abs(nowplace+D));
			}
		} else {
			boolean flag = true;
			int count = 0;
			while (flag) {
				if (count>K) {
					System.out.println(Math.abs(nowplace));
					break;
				}
				nowplace+=D;
				if (nowplace>0) {
					flag = false;
				}
				count++;
			}
			if (count==K) {
				System.out.println(Math.abs(nowplace));
			}
			if ((K-count)%2==0) {
				System.out.println(Math.abs(nowplace));
			} else {
				System.out.println(Math.abs(nowplace-D));
		}

		sc.close();
		}
	}
}