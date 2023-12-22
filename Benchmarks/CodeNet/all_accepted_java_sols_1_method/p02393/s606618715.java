import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int[] a=new int[3];
	a[0]=sc.nextInt();
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();

	int[] b=new int[3];
	b[0]=a[0];
	for(int i=1;i<a.length;i++){
	    b[i]=a[i];
	    int j=i;
	    while(j>0){
	    if(b[j-1]>b[j]){
		int tmp=b[j-1];
		b[j-1]=b[j];
		b[j]=tmp;
	    }
		j--;
	    }
	}
	
	    System.out.println(b[0]+" "+b[1]+" "+b[2]);
	
    
    }
}
