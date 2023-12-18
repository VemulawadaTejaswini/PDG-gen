class Main {
static void insert(int a[],int i,int x){
		int b[] = new int[a.length + 1];
		for(int l = 0;l < a.length;l++)
			b[l] = a[l];
		while(i > 0 && b[i-1] > x){
			b[i] = b[i-1];
			i--;
			}
		b[i] = x;
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args){
		int a[] = {4,3,3,9,5};
		for(int i = 0; i < a.length; i++)
		insert(a,i,a[i+1]);
	}
}