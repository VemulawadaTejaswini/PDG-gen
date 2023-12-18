class Main{
    public static void main(String[] a){
	int m;
	int n;
	int l;
	int o;
	int p;
	for(int i=0;i<10;i++){
		m = Math.max(a[i],a[i+1]);
	}
	System.out.println(m);
	for(int i=0;i<10;i++){
		n = Math.max(a[i],a[i+1]);
	}
	l = Math.min(m,n);
	System.out.println(l);
	for(int i=0;i<10;i++){
		o = Math.max(a[i],a[i+1]);
	}
	p = Math.min(n,o);
	System.out.println(p);

    }
}