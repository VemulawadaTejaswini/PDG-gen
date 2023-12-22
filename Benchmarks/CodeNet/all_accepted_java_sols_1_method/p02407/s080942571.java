import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		boolean flag=true;
		int[] seq = new int[n];
		if(n<=100) {
		
		for(int i=0;i<n;i++) {
			seq[i]=s.nextInt();
			if(seq[i]>=0 && seq[i]<1000) {
				continue;
			}else {
				flag=false;
				break;
			}
		}
		}
		
		if(flag==true) {
			for(int j=n;j>0;j--) {
				if(j!=1) {
					System.out.print(seq[j-1]+" ");
				}else {
					System.out.println(seq[j-1]);
				}
			}
		}
		
	}

}