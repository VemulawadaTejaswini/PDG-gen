import java.util.Scanner;
 
 
 class Main{
 
   public static boolean search(int A[],int n,int key){
		
		int left =0;
		int mid;
		int right =n;
		
		while(left<right){
			mid=(left+right)/2;
			if(key==A[mid]) 
				return true; 
			if(key>A[mid])
				left=mid+1;
			else if(key<A[mid])
				right =mid;
		}
		return false;
	}

    public static void main(String[] args) {
        int A[]=new int[1000000];
        int i,j,n,q,key,sum=0;
         
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++){
            A[i]=s.nextInt();
        }
         
        q=s.nextInt();
        for(j=0;j<q;j++){
            key=s.nextInt();

            if(search(A,n,key))
                          sum++;
        }
      System.out.println(sum);
    }
 
}