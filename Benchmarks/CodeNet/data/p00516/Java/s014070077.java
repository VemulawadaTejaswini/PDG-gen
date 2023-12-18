import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt(); int m=sc.nextInt();
         int a[]=new int[n]; int ca[]=new int [n];
         for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
        	int b=sc.nextInt();
        	for(int i=0;i<n;i++){
        		if(a[i]<=b) {
        			ca[i]++;
        			break;
        		}
        	}
        }
        int temp=ca[0],num=1;
        for(int i=1;i<n;i++){
         if(temp<ca[i]){
        	 temp=ca[i]; num=i+1;
         }
        }
        System.out.println(num);
    }
 }