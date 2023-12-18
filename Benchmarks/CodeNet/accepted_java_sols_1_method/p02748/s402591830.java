import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt();
		int b= scn.nextInt();
		int m = scn.nextInt();
		int [] arr1=new int[a];
		int [] arr2 =new int[b];
		 int[][] arr3 =new int[m][3];
		 for(int i=0;i<a;i++){
			 arr1[i]=scn.nextInt();
			 
		 }
		 for(int i=0;i<b;i++){
			 arr2[i]=scn.nextInt();
		 }
         for(int i=0;i<m;i++){
        	 for(int j=0;j<3;j++){
        		 
        		 arr3[i][j]=scn.nextInt();
        		 if(j!=2)
        		 arr3[i][j]--;
        	 }
         }
         int min = Integer.MAX_VALUE;
         for(int i=0;i<m;i++){
        	 int val =arr1[arr3[i][0]];
        	 int val2  =arr2[arr3[i][1]];
        	 min =Math.min(min, val+val2-arr3[i][2]);
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         min =Math.min(min, arr1[0]+arr2[0]);
         System.out.println(min);
	}

}