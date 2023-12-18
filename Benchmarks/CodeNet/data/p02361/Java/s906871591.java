import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ma1 = line.indexOf(" ");
        int ma2 = line.lastIndexOf(" ");
        
        int vertex = Integer.parseInt(line.substring(0, ma1));
        int edge = Integer.parseInt(line.substring(ma1+1, ma2));
        int resource = Integer.parseInt(line.substring(ma2+1));
        
        int[] startEdge = new int[edge];
        int[] goalEdge = new int[edge];
        int[] cost = new int[edge];
        
        for(int i=0;i<edge;i++){
        	String line2 = sc.nextLine();
            int ma3 = line2.indexOf(" ");
            int ma4 = line2.lastIndexOf(" ");
        	
            startEdge[i]= Integer.parseInt(line2.substring(0, ma3));
            goalEdge[i]	= Integer.parseInt(line2.substring(ma3+1, ma4));	
        	cost[i] = Integer.parseInt(line2.substring(ma4+1));
        }
        
        int[] path = new int[vertex];
        
        for(int i=0;i<vertex;i++){
        	path[i]=-1;
        }
        
        path[resource]=0;
        
        ArrayList<Integer> nextStart = new ArrayList<Integer>();
    	ArrayList<Integer> nextGoal = new ArrayList<Integer>();
    	ArrayList<Integer> nextCost = new ArrayList<Integer>();
    	Set<Integer> know = new LinkedHashSet<Integer>();
        
    	know.add(resource);
    	
    	for(int i=0;i<vertex;i++){
    		if(startEdge[i]==resource){
    			nextStart.add(startEdge[i]);
    			nextGoal.add(goalEdge[i]);
    			nextCost.add(cost[i]);
    		}    		
    	}
    	
        while(nextStart.size()!=0){
        	      	
        	int min = path[nextStart.get(0)]+nextCost.get(0);
        	int save =0;
        	
        	for(int i=1;i<nextStart.size();i++){
        		int load=path[nextStart.get(i)]+nextCost.get(i);
        		if(min>load){
        			save=i;
        			min=load;
        		}
        	}
        	
        	
        	
        	int knowVer=nextGoal.get(save);
        	
        	know.add(knowVer);
        	path[knowVer]=min;
       	
        	for(int i=0;i<edge;i++){
        		if(startEdge[i]==knowVer){
        			nextStart.add(startEdge[i]);
        			nextGoal.add(goalEdge[i]);
        			nextCost.add(cost[i]);
        		}
        	}
        	
        	for(int i=0;i<nextStart.size();i++){
        		if(know.contains(nextGoal.get(i))){
        			nextStart.remove(i);
        			nextGoal.remove(i);
        			nextCost.remove(i);
        			i--;
        		}
        		
        	}
        }
        
        for(int i=0;i<vertex;i++){
        	if(path[i]==-1){
        		System.out.println("INF");
        	}else{
        		System.out.println(path[i]);
        	}
        }
        
    }
}