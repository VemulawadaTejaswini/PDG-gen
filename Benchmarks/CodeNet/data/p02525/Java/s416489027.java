import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] score;
	int sum=0, v;
	double ave, a, sumb=0;
	while(true){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    score = new int [n];
	    for(int i=0;i<n;i++){
		score[i] = sc.nextInt();
		sum+=score[i]; 
	    }
	    ave = (double)sum/n;
	    for(int i=0;i<n;i++) sumb+=((double)(score[i]-ave))*((double)(score[i]-ave));
	    a=Math.sqrt((double)sumb/n);
	    System.out.println(a);	
	}
    }
}