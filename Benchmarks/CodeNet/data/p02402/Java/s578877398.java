import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int min = 0;
		int i = Integer.parseInt(scan.next());
		int[] ary = new int[i];
		for(int a=0;a<i;a++){
			ary[a]=Integer.parseInt(scan.next());
			if(a==0) min=ary[a];
			sum+=ary[a];
			if(ary[a]>max) max = ary[a];
			if(min>ary[a]) min = ary[a];
		}
		System.out.print(min+" "+max+" "+sum);
		scan.close();
	}
}