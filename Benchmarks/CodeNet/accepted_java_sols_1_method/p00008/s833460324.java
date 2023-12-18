import java.util.*;

class Main{
    public static void main(String[] args){
	
	int much,num;
	Scanner s = new Scanner(System.in);
	
	while( s.hasNextInt() ){
	    
	    much=0;
	    num=s.nextInt();
	    
	    for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
		    for(int k=0;k<10;k++){
			for(int l=0;l<10;l++){
			    if( num==i+j+k+l ){
				much++;
			    }
			}
		    }
		}
	    }
	    
	    System.out.println( much );
	    
	}
	
    }
}