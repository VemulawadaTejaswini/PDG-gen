import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static int n = s.nextInt();
public static void main(String[] args) {
StringBuilder sb = new StringBuilder();
int[] a = new int[n+1];

for(int i = 1;i < n;i++) {
a[i] = s.nextInt();
}
buildMaxHeap(a);

for(int i = 1;i < n+1;i++) {
sb.append(" " + a[i]);
}
System.out.println(sb.toString());
}

static void maxHeapify(int[] a,int i) {
	int l = i*2;
	int r = i*2+1;
	int larg = 0;
	if(l <= n && a[l] > a[i]) {
		larg = l;
	}else {
		larg = i;
	}
	if(r <= n && a[r] > a[larg]) {
		larg = r;
	}
	if(larg != i) {
		int tmp = a[i];
		a[i] = a[larg];
		a[larg] = tmp;
	maxHeapify(a,larg);
	}
}

static void buildMaxHeap(int[] a) {
for(int i = n/2;i > 0;i--) {
	maxHeapify(a,i);
}
}
}

