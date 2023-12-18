import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static class Dice{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] dice=new int[7];
	}
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0;
            double sum=0;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	Dice dice1=new Dice();

            	for(int i=0;i<6;i++){
            		
            		dice1.dice[i+1]=Integer.parseInt(str[i]);
            	}
            	line=br.readLine();
            	for(int i=0;i<line.length();i++){
            		if(line.substring(i, i+1).equals("N")){
            			int w=dice1.dice[2];
            			dice1.dice[2]=dice1.dice[6];
            			dice1.dice[6]=dice1.dice[5];
            			dice1.dice[5]=dice1.dice[1];
            			dice1.dice[1]=w;
            		}else if(line.substring(i, i+1).equals("E")){
            			int w=dice1.dice[1];
            			dice1.dice[1]=dice1.dice[4];
            			dice1.dice[4]=dice1.dice[6];
            			dice1.dice[6]=dice1.dice[3];
            			dice1.dice[3]=w;
            		}else if(line.substring(i, i+1).equals("S")){
            			int w=dice1.dice[1];
            			dice1.dice[5]=dice1.dice[6];
            			dice1.dice[6]=dice1.dice[5];
            			dice1.dice[5]=dice1.dice[2];
            			dice1.dice[2]=w;
            		}else if(line.substring(i, i+1).equals("W")){
            			int w=dice1.dice[3];
            			dice1.dice[3]=dice1.dice[6];
            			dice1.dice[6]=dice1.dice[4];
            			dice1.dice[4]=dice1.dice[1];
            			dice1.dice[1]=w;
            		}
            	}
            	System.out.println(dice1.dice[1]);
            	break;
            }
        }
    }

}