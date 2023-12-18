import java.util.*;
public class LongestCommonSubsequence{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	int[] ans=new int[q];
	for(int n=0;n<q;n++){
	    String X=sc.next();
	    String Y=sc.next();
	    int[][] A=new int[X.length()+1][Y.length()+1];
	    for(int i=1;i<X.length()+1;i++){
		for(int j=1;j<Y.length()+1;j++){
		    if((X.substring(i-1,i)).equals(Y.substring(j-1,j))){
			A[i][j]=A[i-1][j-1]+1;
		    }else{
			if(A[i-1][j]<A[i][j-1]){
			    A[i][j]=A[i][j-1];
			}else{
			    A[i][j]=A[i-1][j];
			}
		    }
			
		}
	    }
	    ans[n]=A[X.length()][Y.length()];
	}
	for(int num:ans){
	    System.out.println(num);
	}
    }
}
