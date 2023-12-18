import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int datanum=scan.nextInt();
        while(datanum!=0){
        	int n= scan.nextInt();
        	int [] step =new int[n];
        	for(int i=0;i<n;i++)step[i] =scan.nextInt();
        	int upmax=0;
        	int downmax =0;
        	for(int i=0;i<n-1;i++){
        		if(step[i]<=step[i+1])
        			upmax=Math.max(upmax,step[i+1]-step[i]);
        		else downmax=Math.max(downmax,step[i]-step[i+1]);
        }
        	System.out.println(upmax+" "+downmax);
        	datanum--;
        }
    }
}