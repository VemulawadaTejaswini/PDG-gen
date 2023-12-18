import java.util.Scanner;
 public class Main{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        int min=1000000;
        int max=-1000000;
        long x=0;
        
        for( int i = 0; i<n; i++ ){
           a[i]=sc.nextInt();
            x+=a[i];
        	if(max<a[i]){
        		max=a[i];
            }
            if(min>a[i]){
        		min=a[i];
            }
          }
        System.out.println(min+" "+max+" "+x);
        
        sc.close();
	}
 }
