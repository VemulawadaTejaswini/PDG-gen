class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pasta[]=new int[3];
		int juice[] = new int [2];
		for(int i=0;i<3;i++)pasta[i]=in.nextInt();
		for(int i=0;i<2;i++)juice[i]=in.nextInt();
		int p=0,j=0;
		for(int i=1;i<3;i++){
			if(pasta[i]<pasta[p])p=i;
		}
		for(int i=1;i<2;i++){
			if(juice[i]<juice[j])j=i;
		}
		int ans = pasta[p]+juice[j]-50;
		System.out.println(ans);
		
	}

}