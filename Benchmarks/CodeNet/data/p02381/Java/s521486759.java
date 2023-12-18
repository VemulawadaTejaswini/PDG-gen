public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);

		while(true){
			int n = scan.nextInt();
			int[] s = new int[n];
			double m ,a;
			if(n == 0){
				break;
			}
			m = 0;
			for(int i = 0; i < s.length;i++){
				s[i] = scan.nextInt();
				m += s[i];
			}
			m =m/n;

			a = 0;
			for(int i = 0;i < n;i++){
				a += (s[i] - m)*(s[i] - m) ;
				a = Math.sqrt(a/n);
			}
			System.out.println(a);
		}
	}

}