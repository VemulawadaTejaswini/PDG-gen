import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0084().doIt();
	}

	class aoj0084 {
		void doIt() {
			String str = sc.nextLine();
			String st= str.replace(',', ' ');
			st= st.replace('.', ' ');
			String[] ans = st.split(" ");
			for(int i = 0;i < ans.length;i++){
				if(ans[i].length() >= 3 && ans[i].length() <= 6){
					System.out.print(ans[i]+" ");
				}
			}
			System.out.println();
		}
	}
}