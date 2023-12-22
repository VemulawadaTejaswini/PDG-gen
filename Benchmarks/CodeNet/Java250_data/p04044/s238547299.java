import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n,len;
		n = scan.nextInt();
		len = scan.nextInt();

		String s[] = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = scan.next();
		}

		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if( s[j].compareTo(s[i]) < 0 ){
					swap(i,j,s);
				}
				
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(s[i]);
		}
	}

	static void swap(int x, int y, String[] s){
		String buf;
		buf = s[x]; s[x] = s[y]; s[y] = buf;
	}
}