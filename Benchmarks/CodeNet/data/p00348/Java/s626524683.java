import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line; // ??\???????????????????????\???
            int cnt = 0;
            int row = 0;
            while ((line = br.readLine()) != null) {
            	if(cnt == 0){
            		cnt++;
            		row = Integer.parseInt(line);
            	}else{
            		int count = 0;
            		List<Integer> numList = new ArrayList<Integer>();
            		String[] list = line.split(" ", 0);
            		for(int n = 0; n < row; n++){
            			int a = Integer.parseInt(list[n]);
            			numList.add(a);
            		}
            		
            		int count2 = 0;
            		for(int j = 0; j + 1 < row; j++){
            			for(int i = 0; i + 1 < row; i++){
                			int check = numList.get(0);
                			int check2 = numList.get(i);
                			if(check < check2){
                				count2++;
                			}
                		}
            			if(count2 != 0){
            				numList.remove(0);
            				row = row - 1;
            			}
            			int num = numList.get(j);
                		int secondNum = numList.get(j+1);
                		if(num > secondNum){
                			numList.remove(j);
                			numList.add(num);
                			j = -1;
                			count++;
                		}
            		}
            	System.out.println(count);
            	cnt = 0;
            	}  	
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}