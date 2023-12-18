import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
        Scanner scan = new Scanner(System.in);
        
        int m = 0;
        int f = 0;
        int r = 0;
        
        while(true){
        	
        	m = scan.nextInt();//中間テスト点数
            f = scan.nextInt();//期末テスト点数
            r = scan.nextInt();//再試験点数
        	
	        if(m==-1 && f==-1 && r==-1){
	        	break;
	    	}else if(m==-1 || f==-1){
	    		System.out.println("F");
	    	}else if ( m+f >= 80){
	        	System.out.println("A");
	        }else if(65 <= m+f && m+f < 80){
	        	System.out.println("B");
	        }else if(50 <= m+f && m+f < 65){
	        	System.out.println("C");
	        }else if(30 <= m+f && m+f < 50){
	        	if(r >= 50){
	        		System.out.println("C");
	        	}else{
	        		System.out.println("D");
	        	}
	        }else{
	        	System.out.println("F");
	        }
        
        }
        
    }
}