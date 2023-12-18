import java.util.Scanner;

public class Main {
	static int[][] stones = new int[21][21];
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true){
	        int n = sc.nextInt();
	        if(n==0) break;
	        for(int i=0;i<21;i++) {
	        	for(int j=0;j<21;j++) {
	        		stones[i][j] = 0;
	        	}
	        }
	        for(int i=0;i<n;i++){
	        	int a = sc.nextInt();
	        	int b = sc.nextInt();
	        	stones[b][a] = 1;
	        }
	        /*for(int i=0;i<21;i++){
	        	for(int j=0;j<21;j++) {
	        		System.err.print(stones[i][j]);
	        	}
	        	System.err.println();
	        }
	    	System.err.println(); */
	        
	        
	        int m = sc.nextInt();
	        int x = 10;
	        int y = 10;
	        for(int i=0;i<m;i++){
	        	String or1 = sc.next();
	        	int or2 = sc.nextInt();
	        	switch(or1){
	        	case "N":{
	        		for(int j=1;j<=or2;j++) {
	        			stones[y+j][x] = 0;
	        		}
	        		y += or2;
	        		//System.err.println(x+" "+y);
	        		break;
	        	}
	        	case "E":{
	        		for(int j=1;j<=or2;j++) {
	        			stones[y][x+j] = 0;
	        		}
	        		x += or2;
	        		//System.err.println(x+" "+y);
	        		break;
	        	}
	        	case "S":{
	        		for(int j=1;j<=or2;j++) {
	        			stones[y-j][x] = 0;
	        		}
	        		y -= or2;
	        		//System.err.println(x+" "+y);
	        		break;
	        	}
	        	case "W":{
	        		for(int j=1;j<=or2;j++) {
	        			stones[y][x-j] = 0;
	        		}
	        		x -= or2;
	        		//System.err.println(x+" "+y);
	        		break;
	        	}
	        	}
	        }
	        /*for(int i=0;i<21;i++){
	        	for(int j=0;j<21;j++) {
	        		System.err.print(stones[i][j]);
	        	}
	        	System.err.println();
	        }
	    	System.err.println(); */
	        
	        boolean flag = true;
	        for(int i=0;i<21;i++){
	        	for(int j=0;j<21;j++) {
	        		if(stones[i][j]!=0) {
	        			flag = false;
	        		}
	        	}
	        }
	        if(flag == true) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }  
	    }
	}
}

