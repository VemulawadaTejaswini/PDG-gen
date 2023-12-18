import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doit();

	}
	
	private void doit() {
		new A();
	}

	class A{
		A(){
			while(true){
				int n = sc.nextInt();
				int q = sc.nextInt();
				if((n | q ) == 0) break;
				String name [] = new String[n];
				int [] s = new int[n];
				int [] e = new int[n];
				for(int i = 0 ; i < n; i++){
					name[i] = sc.next();
					int span = sc.nextInt();
					e[i] = sc.nextInt();
					int start = e[i] - span + 1;
					s[i] = start;
				}
				
				while(q-- > 0){
					int input = sc.nextInt();
					boolean ansflg = false, dupflg = false;
					int ind = -1, ans = 0;
					for(int i = 0 ; i < n; i++){
						if(isB(input, s[i], e[i])){
							ansflg = true;
							if(dupflg){
								ansflg = false;
								break;
							}
							
							ind = i;
							ans = input - s[i] + 1;
							
							dupflg = true;
						}else{
							
						}
					}
					if(ansflg){
						System.out.println(name[ind] + " " + ans);
					}
					else{
						System.out.println("Unknown");
					}
				}
			}
		}

		private boolean isB(int input, int s, int e) {
			if(s <= input && input <= e){
				return true;
			}
			return false;
		}
	}
}