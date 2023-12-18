import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_ac=new ArrayList<Integer>();
		//List<Integer> list_wa=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array_ac = new int[n+1];
		int[] array_wa = new int[n+1];
		for(int i=0;m>i;i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(s.equals("AC")){
				array_ac[p] = 1;
			}
			else {
				if(array_ac[p] != 1) {
					array_wa[p]++;
				}
			}
		}
		int ac =0;
		int wa =0;
		for(int i=0;n+1>i;i++) {
			if(array_ac[i]==1)
				ac++;
			if(array_wa[i]>=1)
				if(array_ac[i]==1)
					wa=wa+array_wa[i];
		}
		System.out.println(ac+" "+wa);
	}
}