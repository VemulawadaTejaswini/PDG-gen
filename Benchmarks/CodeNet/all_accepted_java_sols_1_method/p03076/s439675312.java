import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a[]= new int[5];
		int b[]= new int[5];
		int ans=0;
        
        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
            b[i] = 10-a[i]%10;
            if(a[i]%10==0){
                b[i]=0;
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
	            if(b[j]>b[j+1]){
	                int tmp=b[j];
	                b[j]=b[j+1];
	                b[j+1]=tmp;
	                tmp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=tmp;
	            }
	        }
        }
        
        for(int i=0; i<4; i++){
            if (a[i]%10!=0){
                a[i]=a[i]+(10-a[i]%10);
            }
            ans+=a[i];
        }
		
        System.out.println(ans+a[4]);
	}
}