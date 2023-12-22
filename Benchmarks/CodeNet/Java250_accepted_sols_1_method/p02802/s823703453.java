import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] arrayp = new int[100000];
		String[] arrays = new String[100000];
		int[] arrayA = new int[100000];
		int[] arrayW = new int[100000];
		for(int i=0;i<m;i++) {
			arrayp[i] = sc.nextInt();
			arrays[i] = sc.next();
		}
		for(int i=0;i<m;i++) {
			if(arrays[i].equals("AC")){
				arrayA[arrayp[i]]=1;
			}else if(arrayA[arrayp[i]]!=1){
				arrayW[arrayp[i]]+=1;
			}
		}
		long counta=0,countw=0;

		for(int i=0;i<100000;i++) {
			if(arrayA[i]==1) {
				counta+=1;
				if(arrayW[i]>0) {
					countw+=arrayW[i];
				}
			}
		}
		System.out.println(counta+" "+countw);

	}
}


