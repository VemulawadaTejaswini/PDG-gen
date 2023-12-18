public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int max[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			max[i]=a[i];
		}
		java.util.Arrays.sort(max);
		int top = max[max.length-1];
		int second = max[max.length-2];
		for(int i=0;i<a.length;i++) {
			System.out.println((a[i]!=top)?top:second);
		}
	}
}
