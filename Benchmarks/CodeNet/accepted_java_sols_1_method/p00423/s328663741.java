import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a)throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        int gameNum;
        int scoreA = 0;
        int scoreB = 0;
        int numA;
        int numB;                
        
    	while((str = in.readLine()) != null){
            if(str.equals("0")){
                System.exit(0);
            }else{
                gameNum = Integer.parseInt(str);

                for(int i=0;i<gameNum;i++){
                    str = in.readLine();
                    numA = Integer.parseInt(str.split(" ")[0]);
                    numB = Integer.parseInt(str.split(" ")[1]);
                    
                    if(numA > numB){
                        scoreA += (numA + numB);
                    }else if(numA < numB){
                        scoreB += (numA + numB);                    
                    }else{
                        scoreA += numA;
                        scoreB += numB;
                    }
                }                    
                
                System.out.println(scoreA+" "+scoreB);
                scoreA = 0;
                scoreB = 0;
            }
        }
    }
}