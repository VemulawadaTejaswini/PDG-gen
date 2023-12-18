import java.util.Scanner;


class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringBuilder out = new StringBuilder();
        int all = scan.nextInt();
        //?????????
        
        int[]S = new int[14];
        int[]H = new int[14];
        int[]D = new int[14];
        int[]C = new int[14];
        
        for(int i = 1; i <= 13; i++){
        	S[i] = i;
        	H[i] = i;
        	D[i] = i;
        	C[i] = i;
        }//for
        
        for(int i = 1; i <= all; i++){
        	String op = scan.next();
        	int n = scan.nextInt();
        	
        	if(op.equals("S")){
        		for(int j = 1; j <= 13; j++){
        			if(S[j] == n){
        				S[j] = 0;
        			}//if
        		}//for
        		
        	} else if(op.equals("H")){
        		for(int j = 1; j <= 13; j++){
        			if(H[j] == n){
        				H[j] = 0;
        			}//if
        		}//for
        	
        	} else if(op.equals("D")){
        		for(int j = 1; j <= 13; j++){
        			if(D[j] == n){
        				D[j] = 0;
        			}//if
        		}//for
        		
        	} else if(op.equals("C")){
        		for(int j = 1; j <= 13; j++){
        			if(C[j] == n){
        				C[j] = 0;
        			}//if
        		}//for        		
        	}//if
        	
        }//for
       
        //????????????
        for(int i = 1; i <= 13; i++){
        	if(S[i] == 0){
        		out.append( "S " + S[i]);
        	}
        	if(H[i] == 0){
        		out.append( "H " + D[i]);
        	}
        	if(D[i] == 0){
        		out.append( "D " + D[i]);
        	}
        	if(C[i] == 0){
        		out.append( "C " + C[i]);
        	}
        }
        //??????
        System.out.println(out);
	}
}