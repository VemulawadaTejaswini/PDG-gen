public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());

		var cal = new Boolean[a[0]+1];
		for(int i=0;i<cal.length;i++) {
			cal[i]=false;
		}
		var work = -1;
		for(int i=0;i<a.length;i++) {
			if(work==a[i]) {
				cal[a[i]]=false;
			}else {
				cal[a[i]]=true;
				for(int k=a[i]*2;k<cal.length;k+=a[i]) {
					cal[k]=false;
				}
			}
			work=a[i];
		}
		System.out.println(Arrays.stream(cal).filter(v->v).count());
	}
}