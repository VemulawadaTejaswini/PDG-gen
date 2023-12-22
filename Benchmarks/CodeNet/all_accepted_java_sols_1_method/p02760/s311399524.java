import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int[][] A = new int[3][3];

   for(int i=0;i<3;i++) {
	   for(int j=0;j<3;j++) {
		   A[i][j] = sc.nextInt();
	   }
   }
   int n = sc.nextInt();
   for(int k=0;k<n;k++) {
	   int b = sc.nextInt();
   		for(int i=0;i<3;i++){
   			for(int j=0;j<3;j++){
   				if(A[i][j] == b) {
   					A[i][j] = 0;
   				}
   			}
		}
   }
   boolean Judge = false;
   for(int i=0;i<3;i++) {
	   if(A[i] [0]==0&&A[i][1]==0&&A[i][2]==0) {
		   Judge = true;
	   }
	   if(A[0] [i]==0&&A[1][i]==0&&A[2][i]==0) {
		   Judge = true;
	   }
	if(A[0][0]==0&&A[1][1]==0&&A[2][2]==0) {
		Judge = true;
	}
	if(A[0][2]==0&&A[1][1]==0&&A[2][0]==0) {
		Judge = true;
	}
   }
   if(Judge==true) {
	   System.out.println("Yes");
   }
   else {
	   System.out.println("No");
	   }
 }
}