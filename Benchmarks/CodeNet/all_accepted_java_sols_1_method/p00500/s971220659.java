import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int a =0;
	    int h[]  = new int[N];
	    int NN1[] = new int[N];
	    int xx1[] = new int[N];
	    int NN2[] = new int[N];
	    int xx2[] = new int[N];
	    int NN3[] = new int[N];
	    int xx3[] = new int[N];
	    //int x =0,y=0,z=0;
	    for(int i = 0;i < N;i++){
	    	a = sc.nextInt();
    		NN1[i] = a;
    		a = sc.nextInt();
    		NN2[i] = a;
    		a = sc.nextInt();
    		NN3[i] = a; 	
    	}
	    for(int k = 0;k<N;k++){
	    	for(int l = 0;l<N;l++){
	   			//if(k==l) continue;
	   			if(NN1[k]==NN1[l]){
	   				if(k==l){
	   					NN1[k]=NN1[k];
	   				}else{
	   					xx1[k] = 0;
	   					break;
	   				}
	   			}
	   			xx1[k]=NN1[k];
    			/*if(k==l) continue;
	   			if(NN1[k]==NN1[l]){
	   				NN1[k] = 0;
	   			}
	   			if(k==l) continue;
    			if(NN1[k]==NN1[l]){
	    			NN1[k] = 0;
	    		}*/
	   		}
	    	
	   	}
	    for(int k = 0;k<N;k++){
	    	for(int l = 0;l<N;l++){
	   			//if(k==l) continue;
	   			if(NN2[k]==NN2[l]){
	   				if(k==l){
	   					NN2[k]=NN2[k];
	   				}else{
	   					xx2[k] = 0;
	   					break;
	   				}
	   			}
	   			xx2[k] = NN2[k];
	   				
    			/*if(k==l) continue;
	   			if(NN2[k]==NN2[l]){
	   				NN2[k] = 0;
	   			}
	   			if(k==l) continue;
    			if(NN2[k]==NN2[l]){
	    			NN2[k] = 0;
	    		}*/
	   		}
	    	
	   	}
	    for(int k = 0;k<N;k++){
	    	for(int l = 0;l<N;l++){
	   			if(k==l) continue;
	   			if(NN3[k]==NN3[l]){
	   				xx3[k] = 0;
	   				break;
	   			}
    			/*if(k==l) continue;
	   			if(NN3[k]==NN3[l]){
	   				NN3[k] = 0;
	   			}
	   			if(k==l) continue;
    			if(NN3[k]==NN3[l]){
	    			NN3[k] = 0;
	    		}*/
	   			xx3[k]=NN3[k];
	    	}	
   			
	   	}
	    for(int i = 0;i<N;i++){
	    	h[i]=xx1[i]+xx2[i]+xx3[i];
	    	System.out.println(h[i]);
	    }
	}

}