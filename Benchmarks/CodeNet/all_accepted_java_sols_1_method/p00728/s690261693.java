import java.util.Scanner; 
 public class Main{  
     public static void main(String[] args) {     
	 Scanner sc = new Scanner(System.in);   
	 while(true){
	 int n = sc.nextInt();
	 if (n==0){break;}    
	 int[] score;
	 score=new int[n];
	 int max=0,min=1500;
	 for(int i=0;i<n;i++){
	      score[i]=sc.nextInt();
	     if(max<score[i]){max=score[i];}
	     if(min>score[i]){min=score[i];}
	 }
	 int sum=0;
	 for(int i=0;i<n;i++){
	      sum=score[i]+sum;
	 }

	 int average=(sum-min-max)/(n-2);
	 System.out.printf("%d\n",average);
	 }


     } 
 } 