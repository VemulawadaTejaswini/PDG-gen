class Main{
    public static void main(String[] a){
        int l = Integer.parseInt(a[0]);
		int arr[]={0,0,0};
		for(int i=1,j=0;i<l;i=i+3) {
			arr[j] = Integer.parseInt(a[i]);
			arr[j+1] = Integer.parseInt(a[i+1]);
			arr[j+2] = Integer.parseInt(a[i+2]);
			isRightTriangle(arr);
		}
    }

    public static void isRightTriangle(int a[]) {
			int hyp = a[2];
			if(((a[0]*a[0]) + (a[1]*a[1])) == (hyp*hyp)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
	} 
}