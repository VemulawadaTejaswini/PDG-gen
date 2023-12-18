import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		List<Integer> suji=new ArrayList<Integer>();
		int[] kosu=new int[101];
		Scanner sc=new Scanner(System.in);
		int[] kai=new int[101];
		int kaii=0;
		int max=0;
		int yousosu=0;
		int atai=0;
		boolean flags=true;

		for(int i=0; i<101; i++) {
			kosu[i]=0;
		}
		while(sc.hasNext()==true && flags==true) {
			atai=Integer.parseInt(sc.next());
			suji.add(atai);
			yousosu++;
		}
		Collections.sort(suji);

		for(int i=0; i<yousosu; i++) {
			kosu[suji.get(i)]++;
		}
		for(int i=0; i<101; i++) {
			if(kosu[i]>max) {
				kaii=0;
				kai=new int[101];
				kai[kaii]=i;
				kaii++;
			}
			else if(kosu[i]==max) {
				kai[kaii]=i;
				kaii++;
			}
		}

		for(int i=0; i<101; i++) {
			if(kai[i]!=0) {
			System.out.println(kai[i]);
			}
			else {
				break;
			}
		}
	}
}
