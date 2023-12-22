
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	List<List<Integer>> bookList = new ArrayList<List<Integer>>();
    	List<Double> ave = new ArrayList<Double>();
		int j = 0;
	    Scanner scan = new Scanner(System.in);

    	while(true){
    	    if(j ==0){
    	        String str = scan.nextLine();
    	    j =1;
    		if("0".equals(str)) break;
    	    }else{
    	        String str = scan.nextLine();
        		if("0".equals(str)) break;

    	    String[] result=str.split(" ", 0);
        	List<Integer> sumlist = new ArrayList<Integer>();

        	double d1 = 0.0;
        	
        	for(String d :result){
        		d1 += Integer.parseInt(d);
            	sumlist.add(Integer.parseInt(d));
        	}
        	
        	ave.add(d1/sumlist.size());
        	
        	bookList.add(sumlist);
    	    j=0;
    	    }
    	}
    	
    	int i = 0;
    	for(List<Integer> d1 :bookList){
    		int num = 0;
    		for(Integer d2 : d1){
    			if(d2<=ave.get(i)){
    				num++;
    			}
    		}
    		System.out.println(num);
    		i++;
    	}
    }
    
    
}


