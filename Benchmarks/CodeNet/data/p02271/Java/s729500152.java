//16D8101015D
import java.util.*;
public class Exhaustive_search{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();    //数列Aの個数
	int[] A=new int[n];
	for(int i=0;i<n;i++){
	    A[i]=sc.nextInt();    //この数列の値を組み合わせて,
	}
	int q=sc.nextInt();
	int[] m=new int[q];
	for(int i=0;i<q;i++){
	    m[i]=sc.nextInt();    //この数字にする
	}
	int[] flag=new int[q];
	//2個
	for(int c=0;c<m.length;c++){
	    flag[c]=0;
	    for(int i=0;i<A.length-1;i++){
		for(int j=i+1;j<A.length;j++){
		    if(A[i]+A[j]==m[c]){
			flag[c]=1;
			break;
		    }
		}
	    }
	}

	//3個
	for(int c=0;c<m.length;c++){
	    if(flag[c]==0){
		flag[c]=0;
		for(int i=0;i<A.length-2;i++){
		    for(int j=i+1;j<A.length-1;j++){
			for(int k=j+1;k<A.length;k++){
			    if(A[i]+A[j]==m[c]){
				flag[c]=1;
				break;
			    }
			}
		    }
		}
	    }
	    if(flag[c]==0){
		System.out.println("no");
	    }else{
		System.out.println("yes");
	    }
	}
    }
}
