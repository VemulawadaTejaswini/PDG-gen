import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
	public static class Train implements Comparable<Train> {
		String name;
		int come;
		int go;
		
		public Train(String name) {
			super();
			this.name = name;
		}
		
		@Override
		public int compareTo(Train o) {
			// TODO Auto-generated method stub
			return (o.go - o.come) - (this.go - this.come);
		}
		
		public boolean test(final int T){
			if(this.go - this.come >= T){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public static int get_time(Scanner sc){
		String[] input = sc.next().split(":");
		
		int hour = Integer.parseInt(input[0]);
		int minute = Integer.parseInt(input[1]);
		
		return hour * 60 + minute;
	}
	
	public static Train get_train(ArrayList<Train> list, String name){
		final int size = list.size();
		
		for(int i = 0; i < size; i++){
			if(list.get(i).name.equals(name)){
				return list.get(i);
			}
		}
		
		return null;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	final int T = sc.nextInt();
    	
    	ArrayList<Train> list = new ArrayList<Train>();
    	
    	for(int i = 0; i < N; i++){
    		int st_time = get_time(sc);
    		String st_name = sc.next();
    		if(i != 0){
    			Train st = get_train(list, st_name);
    			if(st == null){
    				st = new Train(st_name);
    				list.add(st);
    			}
    			st.go = st_time;
    		}
    				
    		int ar_time = get_time(sc);
    		String ar_name = sc.next();
    		if(i != N - 1){
    			Train ar = get_train(list, ar_name);
    			if(ar == null){
    				ar = new Train(ar_name);
    				list.add(ar);
    			}
    			ar.come = ar_time;
    		}
    	}
    	
    	for(Iterator<Train> iter = list.iterator(); iter.hasNext(); ){
    		Train train = iter.next();
    		
    		if(!train.test(T)){
    			iter.remove();
    		}
    	}
    	
    	Collections.sort(list);
    	
    	System.out.println(list.size());
    	for(Train train : list){
    		System.out.println(train.name + " " + (train.go - train.come));
    	}
    	
    }
     
}