int n = 0;
	int i = 0;
	int x = 0;

	while(n > x) {
		i = i+1;
		x=1000*i;
	}
	int y = x % n;
	System.out.print(y);