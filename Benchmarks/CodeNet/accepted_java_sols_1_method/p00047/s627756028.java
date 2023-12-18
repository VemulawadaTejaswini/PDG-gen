import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = {1,0,0};
		while(cin.hasNext()){
			String s = cin.next();
			int c = s.charAt(0)-'A';
			int d = s.charAt(2)-'A';
			int tmp=a[c];
			a[c]=a[d];
			a[d]=tmp;
		}
		for(int i = 0; i < 3;i++){
			if(a[i]==1){
				System.out.println((char)(i+'A'));
			}
		}
	}

}