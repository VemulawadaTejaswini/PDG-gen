import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kazu,i,j,smi;
		Scanner sca = new Scanner(System.in);
		kazu=sca.nextInt();
		String hai1[]=new String[kazu],hai2[]=new String[kazu],hz;
		int order1[]=new int[kazu], order2[]=new int[kazu],hzi;
		for(i=0;i<kazu;i++){
			hai2[i]=hai1[i]=sca.next();
			order2[i]=order1[i]=i;
		}
       for(i=0;i<kazu-1;i++){
    	   for(j=kazu-1;j>0;j--){
    		   if((int)(hai1[j].charAt(1))<(int)(hai1[j-1].charAt(1))){
    			   hz=hai1[j];
    			   hai1[j]=hai1[j-1];
    			   hai1[j-1]=hz;
    			   hzi=order1[j];
    			   order1[j]=order1[j-1];
    			   order1[j-1]=hzi;
    		   }
    	   }
	}
  for(i=0;i<kazu;i++){
    if(i!=kazu-1){	 
     System.out.print(hai1[i]+" ");
     }else{
    	 System.out.println(hai1[i]);
     }
     }
     System.out.println(hantei(order1,hai1));
 /*select sort*/ 
		for(i=0;i<kazu;i++){
			smi=i;
			for(j=i+1;j<kazu;j++){
				if((int)(hai2[smi].charAt(1))>(int)(hai2[j].charAt(1))){
					smi=j;
				}
				}
			if(smi!=i){
				hz=hai2[smi];
				hai2[smi]=hai2[i];
				hai2[i]=hz;
 			   hzi=order2[smi];
 			   order2[smi]=order2[i];
 			   order2[i]=hzi;				
			}
		}
	     for(i=0;i<kazu;i++){
	    	    if(i!=kazu-1){	 
	    	     System.out.print(hai2[i]+" ");
	    	     }else{
	    	    	 System.out.println(hai2[i]);
	    	     }
	    }
	    	     System.out.println(hantei(order2,hai2));
     
}
	static String hantei(int[] index,String[] data){
		int i;
		for(i=0;i<data.length-1;i++){
			if((data[i].charAt(1))==(data[i+1].charAt(1))){
				if(index[i]>index[i+1]){
					return "Not stable";
				}
				}
		}
		return "Stable";
		
	}
}
