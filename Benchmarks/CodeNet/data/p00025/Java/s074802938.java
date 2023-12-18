import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????

            int[] a = new int[4];
       	 	int[] b = new int[4];
       	 	int count =0;
             String line; // ??\???????????????????????\???
             while ((line = br.readLine()) != null) {
            	 
            	 String[] astr = line.split(" ",0);
            	 String[] bstr = line.split(" ",0);
            	 if(count==0){
            		 count++;
            		 for(int i = 0; i < 4; i++){
                		 a[i] = Integer.parseInt(astr[i]);
                	 };  
            	 }else{
            		 count=0;
            		 for(int i = 0; i < 4; i++){
                		 b[i] = Integer.parseInt(bstr[i]);
                	 };  
                	 hitBlow(a,b);
            	 }            	
             }  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hitBlow(int[] a, int[] b) {
    	int hit = 0;
    	int blow = 0;
    	
    	for(int i=0; i<a.length; i++){
    		if(a[i]==b[i]){
    			hit++;
    		}
    	}
    	for(int i=0;i<a.length; i++){
    		for(int j=0; j<b.length; j++){
    			if(a[i]==b[j]){
    				blow++;
    			}
    		}
    	}	
    	blow = blow - hit;
		System.out.println(hit+" "+blow);
     }
}