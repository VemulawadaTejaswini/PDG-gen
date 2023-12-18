import java.util.*;

public class Main {	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> mountain = new ArrayList<Integer>();
        
        for(int i=0;i<10;i++){
        mountain.add(Integer.parseInt(sc.nextLine()));
        }
        
        for(int i=0;i<3;i++){      	
        	int max = mountain.get(0);
        	int save=0;
        	for(int j=0;j<mountain.size();j++){
        		if(max<mountain.get(j)){
        			max=mountain.get(j);
        			save=j;
        		} 		
        	}
        	System.out.println(mountain.get(save));
        	mountain.remove(save);        	
        }
    }
}