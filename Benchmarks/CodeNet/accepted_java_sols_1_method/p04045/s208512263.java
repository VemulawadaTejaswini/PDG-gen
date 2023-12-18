
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		String[] d = new String[k];
		for(int i=0;i<k;i++) {
			d[i] = sc.next();
		}

		int i=n;
		while(true) {
			String s = Integer.toString(i);
			int flg = 0;
			for(int j=0;j<s.length();j++) {
				String str = s.substring(j, j+1);
				for(int l=0;l<d.length;l++) {
					if(str.equals(d[l])) {
						flg = 1;
					}
				}
			}
			if(flg==0) {
				break;
			}
			i++;
		}

		System.out.println(i);

	}
}
