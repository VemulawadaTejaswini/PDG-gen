public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int r;
	if(a/c+1>=b/d+1) r = l-(a/c+1);
	else r = l-(b/d+1);
	System.out.println(r);
}