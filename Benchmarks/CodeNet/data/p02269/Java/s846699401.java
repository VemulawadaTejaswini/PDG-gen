mport java.io.*;
import java.util.Map;
import java.util.HashMap;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n=0;
    BufferedReader sca=new BufferedReader(new InputStreamReader(System.in));;
    String yomi,sp[]=new String[2];//0:order 1:name
    try{
    n=Integer.parseInt(sca.readLine());
    }catch(Exception e){
	System.out.println(e);
    }
    HashMap<String,String> dicmap=new HashMap<String,String>(n);
    for(i=0;i<n;i++){
	try{
	sp=(sca.readLine()).split("[\\s]+");
	}catch(Exception e){
	    System.out.println(e);
	}
    	if(sp[0].equals("insert")){
	    dicmap.put(sp[1],sp[1]);
    	}
    	if(sp[0].equals("find")){
    		if(dicmap.containsKey(sp[1])){
    			System.out.println("yes");
    		}else{
    			System.out.println("no");
    		}
    	}
    }
	}

}

