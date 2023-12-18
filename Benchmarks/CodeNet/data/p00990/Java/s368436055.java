import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int m;
		String id_str;

		int[] a = new int[10];

		int sum_fixed=0;
		int sum_even=0;
		int sum_odd=0;

		int cand=0;

		int blank_even=0; //2倍してうんぬんする方
		int blank_odd=0;

		int ptn_even=0;
		int ptn_odd=0;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		id_str = sc.next();
		m = sc.nextInt();
		for(int i=0; i<m; i++) a[i] = sc.nextInt();

		sc.close();

		char[] id_char = new char[n];
		id_char = id_str.toCharArray();


		for(int i=0; i<n; i++){
			if(id_char[n-1-i] != '*'){
				if(i%2==0){
					sum_fixed += id_char[n-1-i]-'0';
				}else{
					sum_fixed += (id_char[n-1-i]-'0')*2 - 9*((id_char[n-1-i]-'0')/5);
				}
//				System.out.println(id_char[n-1-i]);
			}else{
				if(i%2==0){
					blank_odd++;
				}else{
					blank_even++;
				}
			}
//			System.out.println(n-1-i);

		}

		ptn_odd = (int) Math.pow(m, blank_odd);
		ptn_even = (int) Math.pow(m, blank_even);

//		System.out.println(ptn_odd);
//		System.out.println(ptn_even);
//		System.out.println(blank_odd);
//		System.out.println(blank_even);

		for(int i=0; i<ptn_odd; i++){
			for(int j=0; j<ptn_even; j++){
				for(int k=0; k<blank_odd; k++){
					//System.out.println(ptn_odd/(int)Math.pow(m, k));

					sum_odd += a[(i/(int)Math.pow(m, k))%m];
				}
				//System.out.println(sum_odd);
				for(int k=0; k<blank_even; k++){
					sum_even += a[(j/(int)Math.pow(m, k))%m]*2 - 9*(a[(j/(int)Math.pow(m, k))%m]/5);
				}
				//System.out.println(sum_even);
				//System.out.println(sum_fixed);
//				System.out.println(sum_odd + sum_even + sum_fixed);
				if((sum_odd + sum_even + sum_fixed) % 10 == 0) {

					cand++;

				}
				sum_odd=0;
				sum_even=0;
			}
		}

		System.out.println(cand);


	}

}