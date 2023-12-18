import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;


class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	HashMap<String, Integer> hs = new HashMap<String, Integer>();
	ArrayList<String> list_yn = new ArrayList<String>();

	try{
	    int n = Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++){
		String line = br.readLine();
		String[] com_val = line.split(" ",0);
		
		if(com_val[0].equals("insert")){
		    hs.put(com_val[1],0);
		}else if(com_val[0].equals("find")){
		    //System.out.println("a");
		    if(hs.get(com_val[1])==null){
			list_yn.add("no");
		    }else{
			list_yn.add("yes");
		    }
		}
	    }
	}catch(Exception e){
	    
	}

	for(int i=0;i<list_yn.size(); i++){
	    System.out.println(list_yn.get(i));
	}
    }
}

