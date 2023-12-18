import java.util.*;
class Main{
	public static void main(String[] args){
	    Scanner x=new Scanner(System.in);
	    int s = x.nextInt();
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i=0;i<s;i++){
		    int a = x.nextInt();
            if(a==0){
	    		list.add(x.nextInt());
	    	}else if(a==2){
	    		list.remove(list.size()-1);
	    	}else if(a==1){
	    		System.out.println(list.get(x.nextInt()));
	    	}
	    }
	}
}	   
