import java.util.Scanner;



public class Main {
static int n;
static int S[]=new int[500001];
static int count=0;

  public static void merge(int left,int mid,int right){

	  
	  int i,j;
	  mid=(left+right)/2;

	  int n1=mid-left;
	  int n2=right-mid;
	 int infty=Integer.MAX_VALUE;

	  int R[]=new int[n1+2];
	  int L[]=new int[n2+2];

	  for(i=0;i<n1;i++){
		  L[i]=S[left+i];
	  }
	  for(i=0;i<n2;i++){
		  R[i]=S[mid+i];
	  }

	  L[n1]=infty;
	  R[n2]=infty;
	i=0;
	j=0;

	for(int k=left;k<right;k++){
		count++;
		if(L[i]<=R[j]){
			S[k]=L[i];
			i++;
		}
		else{
			S[k]=R[j];
			j++;
		}
	}
  }
  
  public static void mergesort(int left,int right){
	  if(left+1<right){
		  int mid=(left+right)/2;
		  
		  mergesort(left,mid);
		  mergesort(mid,right);
		  merge(left,mid,right);
		 
	  }
  }
  
  
	public static void main(String[] args) {
		int i;
	    int left1,right1;

		 Scanner sc=new Scanner(System.in);
		 n=Integer.parseInt(sc.next());

		  for(i=0;i<n;i++){
		  	  S[i]=Integer.parseInt(sc.next());
		  }
		  left1=0;
		  right1=n;
		 
		  mergesort(left1,right1);
		 

			  for(i=0;i<n;i++){
					System.out.print(S[i]);
					if(i==n-1){System.out.println("");
					}
			  else{
				  System.out.print(" ");
			  }
			  }
			  System.out.println(count);
  }
}