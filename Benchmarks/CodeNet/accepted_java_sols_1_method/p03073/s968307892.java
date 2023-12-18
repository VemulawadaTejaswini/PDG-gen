import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int []N = new int[str.length()];
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				N[0]=Integer.parseInt(str.substring(0,1));
			}
			else{
				String n = str.substring(i,i+1);
				N[i] = Integer.parseInt(n);
				if(N[i] == N[i-1]){
					N[i]=(N[i]==1)?0:1;
					sum++;
				}
			}
		}
		System.out.print(sum);
	}
}