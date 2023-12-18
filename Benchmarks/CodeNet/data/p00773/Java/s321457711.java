public class Main {
	public static void main(String[] args){
		int i,j,s,k=0,t=0,max;	
		double x,y,oldRate,newRate;
		
		while(Integer.parseInt(args[k]) != 0){
			x = Integer.parseInt(args[k]);	
			y = Integer.parseInt(args[k+1]);	
			oldRate = (100+x)/100;
			newRate = (100+y)/100;
			s = Integer.parseInt(args[k+2]);	
			max = 0;
                        t = 0;		

			for(i=1; i<s; i++){	
				for(j=1; j<s; j++){
					if(((int)(i*oldRate)+(int)(j*oldRate)) == s){
						t = (int)(i*newRate)+(int)(j*newRate);	
						max = Math.max(max,t);
					}
				}
			}
			
			if(t == 0){
				k += 3;
				continue;
			}
			System.out.println(max);
			k += 3;
		}
	}
}