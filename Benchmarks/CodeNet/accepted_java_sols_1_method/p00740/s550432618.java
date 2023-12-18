import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true){
	        int n = sc.nextInt();
	        int p = sc.nextInt();
	        if(n==0 && p==0) break;
	        int [] kouho = new int[n];
	        int stone = p;
	        int i=0;
	        while(true){
	        	if(stone>0){
	        		kouho[i]++;
	        		stone--;
	        	}else{
	        		stone = kouho[i];
	        		kouho[i] = 0;
	        	}
	        	boolean flag = false;
	        	if(stone == 0){
	        		if(kouho[i] == p){
	        			flag = true;
	        		}
	        		if(flag) break;
	        	}
	        	i=(i+1)%n;
	        }
	        System.out.println(i);
	    }
	}
}
