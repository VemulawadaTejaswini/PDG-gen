import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ma =line.indexOf(" ");
        int process = Integer.parseInt(line.substring(0, ma));
        int quantum = Integer.parseInt(line.substring(ma+1));
               
        ArrayList<String> lingerJob = new ArrayList<String>();
        ArrayList<Integer> lingerTime = new ArrayList<Integer>();
        
        for(int i=0;i<process;i++){
            String line2 = sc.nextLine();
            int ma2 =line2.indexOf(" ");
            lingerJob.add(line2.substring(0, ma2));
            lingerTime.add(Integer.parseInt(line2.substring(ma2+1)));      	
        }

        int save=-1;
        int timeCount=0;
        
        while(lingerJob.size()!=0){
        	for(int i=0;i<lingerJob.size();i++){
        		if(lingerTime.get(0)>quantum){
        			lingerTime.add(lingerTime.get(0)-quantum);
        			lingerTime.remove(0);
        			lingerJob.add(lingerJob.get(0));
        			lingerJob.remove(0);
        			timeCount=timeCount+quantum;
        		}else{
        			timeCount=timeCount+lingerTime.get(0);
        			System.out.println(lingerJob.get(0)+" "+timeCount);
        			lingerTime.remove(0);
        			lingerJob.remove(0);
        		}
        	}
        }
    }   
}