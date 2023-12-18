public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		int z = sc.nextInt();
		if(z > 100) System.out.printf("NG");
		int h[] =new int[z];
		for(int i=0;i<z;i++){
			h[i]=sc.nextInt();
		}
		for(int j=0;j<z;j++){
			if(j==0)System.out.print(""+h[z-1]);
			else System.out.printf(" %d",h[z-(j+1)]);
			
			if(j==(z-1))System.out.printf("\n");
		}
		sc.close();
		System.exit(0);
	}