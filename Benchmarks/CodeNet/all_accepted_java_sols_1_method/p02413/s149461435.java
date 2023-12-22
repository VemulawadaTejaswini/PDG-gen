import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int r=as.nextInt();        //????????°
        int c=as.nextInt();        //????????°
        
        int i,j;
        int smr = 0;
        int src = 0;
        int glf[][];
        int smc[];
        glf = new int[r+1][c+1];   //??????
        smc = new int[c];
        String str;
        
        for(i=0;i<r;i++){          
            for(j=0;j<c+1;j++){
            	
            	if(j == c){
            		
            		glf[i][j]=smr;
            		
            	}
            	else{
            		
            		
   
            		glf[i][j]=as.nextInt();     //?????????????´?
                	smc[j]=smc[j]+glf[i][j];
            		smr=smr+glf[i][j];
            		src=src+glf[i][j];
            		
            	}
                 
            }
            
            smr=0;
            
        }
        
        for(i=0;i<c+1;i++){
        	if(i == c){
        	
        		glf[r][i]=src;
        		
        	}
        	else{
        		
        		glf[r][i]=smc[i];
        		
        	}
        	
        }
        
        for(i=0;i<r+1;i++){
        	for(j=0;j<c+1;j++){
        		
        		if(j == c){
        			
        			str=String.valueOf(glf[i][j]);
        			System.out.println(str);
        			
        		}
        		else{
        			
        			str=String.valueOf(glf[i][j])+" ";
        			System.out.print(str);
        			
        		}
        	}
        }
            

	}

}