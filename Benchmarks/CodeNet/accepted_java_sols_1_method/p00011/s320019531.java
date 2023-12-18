import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line; // ??\???????????????????????\???
            int cnt = 0;
            List<Integer> numList = new ArrayList<Integer>();
            int row = 0;
            int column = 0;
            while ((line = br.readLine()) != null) {
            	if(cnt == 0){
            		cnt++;
            		row = Integer.parseInt(line);
            		for(int i = 1; i < row+1; i++){
            			numList.add(i);
            		}
            	}else if(cnt == 1){
            		cnt++;
            		column = Integer.parseInt(line);
            	}else{
            		String[] convertList = line.split(",", 0);
            		int first = Integer.parseInt(convertList[0]);
            		int second = Integer.parseInt(convertList[1]);
            		
            		int firstNum = numList.get(first - 1);
            		int secondNum = numList.get(second - 1);
            		
            		numList.set(first - 1, secondNum);
            		numList.set(second - 1, firstNum);
            	}  	
            }
            for(int j = 0; j < numList.size(); j++){
        		System.out.println(numList.get(j));
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}