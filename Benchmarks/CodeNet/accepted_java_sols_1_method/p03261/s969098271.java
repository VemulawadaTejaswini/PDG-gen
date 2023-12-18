import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n;
		boolean ans=true;
		String[] w = new String[101];

		n=sc.nextInt();

		for(int i=1;i<=n;i++) {
			w[i]=sc.next();
		}

		char ch=w[1].charAt(w[1].length()-1);

		for(int i=2;i<=n;i++) {
			if(ch==w[i].charAt(0)) {
				ch=w[i].charAt(w[i].length()-1);
			} else {
				ans=false;
				break;
			}
		}

		twho:for(int i=1;i<=n;i++) {
			for(int k=i+1;k<=n;k++) {
				if(w[i].equals(w[k])) {
					ans=false;
					break twho;
				}
			}
		}

		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
