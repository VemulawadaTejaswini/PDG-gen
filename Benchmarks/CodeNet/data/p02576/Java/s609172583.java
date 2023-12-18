 class Main {
	static long findTime(int N,int X,int T){
    	if(N<=X)
          return T;
      	long count=(long)Math.ceil((double)N/X);
      	//System.out.println(count);
      	return count*T;
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	int X=sc.nextInt();
      	int T=sc.nextInt();
      	System.out.println(findTime(N,X,T));
	}

}
