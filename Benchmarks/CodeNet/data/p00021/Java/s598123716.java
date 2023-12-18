import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //1???????????????????????????????????°???????????????
        String str = br.readLine();
        //???????????????????????????????????????????????????
        int calcCnt = Integer.parseInt(str);
        
        for(int i = 0; i < calcCnt; i++){
        	String data = br.readLine();
        	String[] strZahyo;
        	strZahyo = data.split(" ");
        	double[] zahyo = new double[strZahyo.length];
        	for(int j = 0; j < strZahyo.length; j++){
        		zahyo[j] = Double.parseDouble(strZahyo[j]); 
        	}
        	double slope1, slope2, slope1x, slope2x,slope1y,slope2y;
        	slope1x = zahyo[2]-zahyo[0];
        	slope1y = zahyo[3]-zahyo[1];
        	slope2x = zahyo[6]-zahyo[4];
        	slope2y = zahyo[7]-zahyo[5];
        	if(slope1x == (double)0.0 && slope2x == (double)0.0){
        		System.out.println("YES");
        		continue;        	
        	}else if(slope1x == (double)0.0){
        		System.out.println("NO");
        	}else if(slope2x == (double)0.0){
        		System.out.println("NO");
        	}
        	
        	slope1 = slope1y/slope1x;
            slope2 = slope2y/slope2x;
            
            if(slope1 == slope2)System.out.println("YES");
            else System.out.println("NO");
            
        }
        
	}

}