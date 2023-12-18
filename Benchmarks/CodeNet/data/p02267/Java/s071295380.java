import java.util.*;
class Main{
	static int search(int[] data, int key){
		int[] a = new int[data.length+1];
        System.arraycopy(data, 0, a, 0, data.length);
        a[a.length-1]=key;
		for(int i=1;i <= a.length-1;i++){
			if(a[i-1]==key && i<=a.length-2){
				return 1;
			    
		    } if(a[a.length-1-i]!=a[a.length-1] && i==a.length-1){
			    return 0;
			}
	    }return 1;
	}
	public static void main(String[] args){
		int count = 0;
		Scanner x=new Scanner(System.in);
	    int s1 = x.nextInt();
		int[] r1=new int[s1+1];
		for(int i=0;i<s1;i++){
		    r1[i]=x.nextInt();
		}
		
	    int s2 = x.nextInt();
		int[] r2=new int[s2];
		for(int j=0;j<s2;j++){
		    r2[j]=x.nextInt();
		}
		x.close();
		if(s1<s2){
		for(int i=0;i<s1;i++){
			if(search(r1,r2[i])==1){
				count++;
			}
		}
		}else if(s1>s2){
			for(int j=0;j<s2;j++){
			    if(search(r1,r2[j])==1){
				    count++;	
		       }
			}
		}
		System.out.println(count);
	}
}
