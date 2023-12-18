

public class main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner cs = new Scanner(System.in);
		int L = cs.nextInt();
		int A = cs.nextInt();
		int B = cs.nextInt();
		int C = cs.nextInt();
		int D = cs.nextInt();
		int ans, japan, math;
		japan = A / C;
		if(A % C !=0){
			japan = japan + 1;
		}
		math = B / D;
		if(B % D != 0){
			math =math + 1;
		}
		if(japan < math){
			ans = L - math;
		}else{
			ans = L - japan;
		}
		System.out.println(ans);

	}

}