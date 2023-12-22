import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
      	int size=sc.nextInt();
      	int[][] arr=new int[size][3];
      for(int i=0;i<size;i++){
      	for(int j=0;j<3;j++){
        	arr[i][j]=sc.nextInt();
        }
      }
      int[][] res=new int[size][3];
      res[0][0]= arr[0][0];
      res[0][1]= arr[0][1];
      res[0][2]= arr[0][2];
      for(int i=1;i<size;i++){
      	for(int j=0;j<3;j++){
          res[i][j]=Math.max(res[i-1][(j+1)%3],res[i-1][(j+2)%3])+arr[i][j];
        }
      }
      System.out.println(Math.max(res[size-1][2],Math.max(res[size-1][0],res[size-1][1])));
    }
}