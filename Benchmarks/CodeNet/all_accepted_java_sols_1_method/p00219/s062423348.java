import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while(true){
        	int n=scan.nextInt();
        	if(n==0)break;
        	int [] ice =new int[10];
        	for(int i=0;i<n;i++){
        		ice[scan.nextInt()]++;
        	}
        	for(int k : ice){
        		if(k==0)System.out.print("-");
        		else for(int i=0;i<k;i++)System.out.print("*");
        		System.out.println();
        	}
        }
    }
}