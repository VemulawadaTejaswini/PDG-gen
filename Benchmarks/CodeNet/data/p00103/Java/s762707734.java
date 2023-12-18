import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
        	int point = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            List<String> runner = new ArrayList<>();
            List<String> out = new ArrayList<>();
            while((line = br.readLine()) != null){
            int cntRunner = runner.size();
            if(line.equals("HIT")){
            	if(cntRunner == 3){
            		point++;
            	}else if (cntRunner < 3){
            	runner.add(line);
            	}
            }else if(line.equals("HOMERUN")){
            	point = point + cntRunner + 1;
            	runner.clear();
            }else if(line.equals("OUT")){
            	out.add(line);
            	int cntOut = out.size();
            	if(cntOut == 3){
            		System.out.println(point);
            		point = 0;
            		runner.clear();
            		out.clear();
            	}
              }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}