import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in);
		int n = st.nextInt();
		int a = st.nextInt();
		int b = st.nextInt();
		String s = st.next();
		char[] sAr = s.toCharArray();
		int counta=0;
		int countb = 0;
		for (int i=0;i<n;i++){
		
			if (sAr[i]=='c'){
				System.out.println("No");
			}
			else{
				if (counta+countb>=a+b){
					System.out.println("No");
				}
				else {
					if (sAr[i]=='a'){
						counta++;
						System.out.println("Yes");
					}
					else if (sAr[i]=='b'&&countb<b){
						countb++;
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}
			}
		}
	}

}