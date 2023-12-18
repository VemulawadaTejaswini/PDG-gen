import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            String[] listA = null;
            String[] listB = null;
            int count = 0;
            while((line = br.readLine()) != null){
            	if(count == 0){
            		count++;
            		listA = line.split(" ", 0);
            	}else{
            		count++;
            		listB = line.split(" ", 0);
            	}
            	if(count == 2){
            		count = 0;
	            	int hit = hit(listA, listB);
	                int hitBlowCounter = blow(listA, listB);
	                int blow = hitBlowCounter - hit;
	                System.out.println(hit + " " + blow);
            	}
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int hit(String[] listA, String[] listB) {
    	int hit = 0;
    	// ListA??????????????????
    	int firstA = Integer.parseInt(listA[0]);
    	int secondA = Integer.parseInt(listA[1]);
    	int thirdA = Integer.parseInt(listA[2]);
    	int fourseA = Integer.parseInt(listA[3]);
    	 // ListB??????????????????
    	int firstB = Integer.parseInt(listA[0]);
    	int secondB = Integer.parseInt(listA[1]);
    	int thirdB = Integer.parseInt(listA[2]);
    	int fourseB = Integer.parseInt(listA[3]);
    	
    	if(firstA == firstB) hit++;
    	if(secondA == secondB) hit++;
    	if(thirdA == thirdB) hit++;
    	if(fourseA == fourseB) hit++;
    	
    	return hit;
    }
    
    private static int blow(String[] listA, String[] listB) {
    	int hitBlow = 0;
    	int i = 0;
    	int j = 0;
    	for(i = 0; i < 4; i++){
    		for(j = 0; j < 4; j++){
    			int rdmA = Integer.parseInt(listA[i]);
    			int rdmB = Integer.parseInt(listB[j]);
    			
    			if(rdmA == rdmB){
    				hitBlow++;
    			}
    		}
    	}
        return hitBlow;
    }
}