class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int K = sc.nextInt();
		int now = 0;
		boolean flag = true;
		for (int index=0; index<K; index++) {
			now=(10*now+7);
			now%=K;
			if(now==0) {
				System.out.println(index+1);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("-1");
		}
		sc.close();
	}
}