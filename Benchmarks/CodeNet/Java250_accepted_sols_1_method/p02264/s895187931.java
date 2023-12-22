import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ma = line.indexOf(" ");
        int jobAmount = Integer.parseInt(line.substring(0, ma));
        int quantum = Integer.parseInt(line.substring(ma+1));
        
        ArrayList<String> lingerJob = new ArrayList<String>();
        ArrayList<Integer> lingerTime = new ArrayList<Integer>();
        
        for(int i=0;i<jobAmount;i++){
        	String line2 = sc.nextLine();
        	int ma2 = line2.indexOf(" ");
        	
        	lingerJob.add(line2.substring(0, ma2));
        	lingerTime.add(Integer.parseInt(line2.substring(ma2+1)));
        }
        
        
        
        int nowTime=0;
        
        while(lingerJob.size()!=0){
        	
        	if(lingerTime.get(0)>quantum){
        		lingerJob.add(lingerJob.get(0));
        		lingerJob.remove(0);
        		lingerTime.add(lingerTime.get(0)-quantum);
        		lingerTime.remove(0);
        		nowTime+=quantum;  		
        	}else{
        		nowTime+=lingerTime.get(0);
        		System.out.println(lingerJob.get(0)+" "+nowTime);
        		lingerJob.remove(0);
        		lingerTime.remove(0);       		
        	}
        }
    }
}