import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String a[] = new String[1000];
		int n = 0;
		while(scan.hasNext()){
			a[n] = scan.next();
			n++;
		}
		
		String m = 	"";
		int max = 0;
		String w = null;
		for(int i = 0;i < n;i++){
			int c = 0;
			if(m.length() < a[i].length()){
				m = a[i];
			}
			for(int j = 0;j < n;j++){
				if(a[i].equals(a[j])){
					c++;
				}
			}
			if(max < c){
				max = c;
				w = a[i];	
			}	
		}
		System.out.println(w + " " + m);
	}

}