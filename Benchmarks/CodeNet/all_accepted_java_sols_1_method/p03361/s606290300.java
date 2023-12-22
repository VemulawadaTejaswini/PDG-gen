import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int H=sc.nextInt();
int W=sc.nextInt();
 String a[][]=new String[H+2][W+2];
 String b[]=new String[H];
 for(int k=0;k<H;k++) {
	 b[k]=sc.next();
 }
 for(int i=0;i<=H+1;i++) {
	 for(int j=0;j<=W+1;j++) {
		 a[i][j]=".";
	    }
    }
 for(int i=1;i<=H;i++) {
	 for(int j=1;j<=W;j++) {
		 a[i][j]=b[i-1].substring(j-1,j);
	    }
    }	
boolean out[][]=new boolean[H+2][W+2];

//inside
 for(int i=1;i<=H;i++) {
	 for(int j=1;j<=W;j++) {
		 if(a[i][j].equals("#")) {
	      if(!(a[i-1][j].equals("#")||a[i+1][j].equals("#")||a[i][j-1].equals("#")||a[i][j+1].equals("#"))){
	    	  out[i][j]=true;
	      }
		 }
	 }
 }
 String answer="Yes";
 for(int i=1;i<=H;i++) {
	 for(int j=1;j<=W;j++) {
		 if(out[i][j]) {
			 answer="No";
			 break;
		 }
	    }
    }	
 System.out.println(answer);
 }
}