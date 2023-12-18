import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line; // ??\???????????????????????\???
            int cnt = 0;
            int check = 0;
            List<Integer> numList = new ArrayList<Integer>();
            int row = 0;
            while ((line = br.readLine()) != null) {
            	if(cnt == 0){
            		cnt++;
            		row = Integer.parseInt(line);
            	}else{
            		String[] list = line.split(" ", 0);
            		for(int n = 0; n < row; n++){
            			int a = Integer.parseInt(list[n]);
            			numList.add(a);
            		}
            		int count = 0;
            		for(int j = 0; j < row; j++){
            			if(j + 1 >= row){
            				break;
            			}
            			int num = numList.get(j);
                		int secondNum = numList.get(j+1);
                		if(num > secondNum){
                			numList.remove(j);
                			numList.add(num);
                			j = 0;
                			count++;
                		}
            		}
            	System.out.println(count);
            	}  	
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}