import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Dice {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0,out=0;
        int i=0,rou=0,store=1;
        boolean first=true;
        List<Integer> score=new ArrayList<Integer>();
        int[] dice=new int[3];
        boolean[] rui=new boolean[3];

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	if(line.equals("0")){
                	break;
                }
            	if(first){
            		length=Integer.parseInt(line);
            		for(int k=0;k<3;k++){
            			dice[k]=k+1;
            		}
            		first=false;
            	}else{
            		if(line.equals("North")){
            			int w=dice[0];
            			dice[0]=dice[1];
            			dice[1]=7-w;
            		}else if(line.equals("East")){
            			int w=dice[2];
            			dice[2]=dice[0];
            			dice[0]=7-w;
            		}else if(line.equals("West")){
            			int w=dice[0];
            			dice[0]=dice[2];
            			dice[2]=7-w;
            		}else if(line.equals("South")){
            			int w=dice[1];
            			dice[1]=dice[0];
            			dice[0]=7-w;
            		}else if(line.equals("Left")){
            			int w=dice[2];
            			dice[2]=dice[1];
            			dice[1]=7-w;
            		}else if(line.equals("Right")){
            			int w=dice[1];
            			dice[1]=dice[2];
            			dice[2]=7-w;
            		}
            		store+=dice[0];
            		i++;
            	}
            	if(length==i){
            		i=0;
            		rou++;
            		score.add(store);
            		store=1;
            		first=true;
            	}

            }
            for(int k=0;k<score.size();k++){
            	System.out.println(score.get(k));
            }
		}
	}

}