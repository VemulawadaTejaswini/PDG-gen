import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0;
		long max = 0;
		long min = 0;
		int i = Integer.parseInt(scan.next());
		long[] ary = new long[i];
		for(int a=0;a<i;a++){
			ary[a]=Long.parseLong(scan.next());
			if(a==0){ 
				min=ary[a];
				max=ary[a];
			}
			sum+=ary[a];
			if(ary[a]>max) max = ary[a];
			if(min>ary[a]) min = ary[a];
		}
		System.out.println(min+" "+max+" "+sum);
		scan.close();
	}
}