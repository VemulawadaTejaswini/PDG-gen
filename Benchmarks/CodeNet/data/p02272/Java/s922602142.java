import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static int count = 0;
public static void main(String[] args) {
	int n = s.nextInt();
	int[] a = new int[n];
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		a[i] = s.nextInt();
	}
	margeSort(a,0,n);
for(int i = 0;i < n-1;i++) {
	sb = sb.append(a[i] + " ");
}
System.out.println(sb.toString() + a[n-1]);
System.out.println(count);
}

public static void marge(int[] a,int l,int m,int r) {
	int n1 = m -l;
	int n2 = r - m;
	int[] L = new int[n1+1];
	int[] R = new int[n2+1];

	for(int i = 0;i < n1;i++) {
		L[i] = a[l + i];
	}
	for(int i = 0;i < n2;i++) {
	R[i] = a[m + i];
	}
	L[n1]  = 1000000001;
	R[n2] = 1000000001;

	int i = 0,j = 0;
	for(int k = l;k < r;k++) {
		if(L[i] <= R[j] && L[i] != 1000000001) {
			a[k] = L[i];
			i++;
			count++;
		}else {
			a[k] = R[j];
			j++;
			count++;
		}
	}
}

public static void margeSort(int[] a,int l,int r) {
	int m;
	if(l + 1 < r) {
		m = (l + r)/2;
		margeSort(a,l,m);
		margeSort(a,m,r);
		marge(a,l,m,r);
	}
}
}

