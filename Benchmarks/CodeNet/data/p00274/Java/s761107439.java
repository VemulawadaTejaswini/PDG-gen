import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int a[]=new int[n];
            int cnt=0;
	    int cnt2=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>=2){
                    cnt++;
                }
		if(a[i]>0){
		    cnt2++;
		}
            }
            if(cnt==0){
                System.out.println("NA");
            }else{
                System.out.println(cnt2+1);
            }
        }
    }
}
