import java.io.*;

class Main {
	private static int score = 0;
    private static int outCount = 0;
    private static boolean runner[] = new boolean[3];
	
	public static void main(String[] args) {
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            StringBuilder stringBuilder = new StringBuilder();
            
            //??\???????????????????????????????????°???????????????
            int dataSet = Integer.parseInt(br.readLine());
            for(int i=0; i<dataSet; i++){
	            String line;
	            while ((line = br.readLine()) != null) {
	            	switch (line) {
					case "HIT":
						hit(runner);
						break;
					
					case "HOMERUN":
						homeRun();
						break;
					
					case "OUT":
						out();
						break;
					
					default:
						break;
					}
	            	if(outCount==3){
	            		outCount=0;
	            		break;
	            	}
	            }
	            stringBuilder.append(score + "\n");
            }
            System.out.print(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hit(boolean[] runner) {
    	//????????????3???
    	if(runner[2]){
    		++score;
    	}else{
    		//????????????????¬?????????????????????????
    		runner[2] = runner[1];
    		runner[1] = runner[0];
    		runner[0] = true;
    	}
    }
    
    public static void homeRun() {
    	//??????1????????\???
    	++score;
    	for(int j=0; j<runner.length;j++){
    		if(runner[j]){
    			++score;
    			runner[j] = false;
    		}
    	}
    }
    
    public static int out() {
		if(outCount==3){
    		return 0;
    	}
		return ++outCount;
    }
}