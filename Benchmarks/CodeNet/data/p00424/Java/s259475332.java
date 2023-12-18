import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
    public static void main(String[] a)throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        int stackNum;
        int transNum;
        HashMap<String,String> transMap = new HashMap<String,String>();
        
    	while((str = in.readLine()) != null){
            if(str.equals("0")){
                System.exit(0);
            }else{
                transNum = Integer.parseInt(str);
                transMap.clear();
                
                for(int i=0; i<transNum; i++){
                    str = in.readLine();
                    transMap.put(str.split(" ")[0],str.split(" ")[1]);
                }
                
                stackNum = Integer.parseInt(in.readLine());
                
                for(int i=0; i<stackNum; i++){
                    str = in.readLine();
                    for(int j=0; j<transNum; j++){
                        if(transMap.containsKey(str)){
                            str = transMap.get(str);
                            break;
                        }
                    }
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}