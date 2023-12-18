class Main {
	public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int m=s.nextInt();
	  int R[]=new int[m];
	  int count=0;
	  for(int i=0;i<m;i++){
		  R[i]=s.nextInt();
	  }
	  for(int i=m-1;i>=0;i--){
		  while(n>R[i]){
	    		n-=R[i];
	    		count++;
	    	}
	  }	  
	  System.out.println(count); 
	}
}