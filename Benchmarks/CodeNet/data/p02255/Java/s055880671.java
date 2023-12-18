import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[] a=new int[7];
		int n;
	    n=scan.nextInt();
	    for(int i=0;i<n;i++)
	        a[i]=scan.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int s=0;s<n;s++){
	           if(s>0){
	                System.out.print(" ");
	                }
	          System.out.print(a[s]);

	        }
	        if(i<n-1)
	            System.out.println();
	        int j=i+1;
	        if(j<n && (a[i]>a[i+1]))
	        {
	            int temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            j=i-1;
	            for(int k=i;k>0;k--)
	            {
	                if(a[k]<a[j])
	                {
	                    temp=a[k];
	                    a[k]=a[j];
	                    a[j]=temp;
	                    j--;
	                    continue;
	                }
	                else
	                    break;
	            }

	        }
	    }
	}
}