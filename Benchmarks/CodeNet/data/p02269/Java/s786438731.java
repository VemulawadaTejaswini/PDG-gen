import java.io.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i,j,n=0,maxi=0;
    BufferedReader sca=new BufferedReader(new InputStreamReader(System.in));;
    String yomi,sp[]=new String[2];//0:order 1:name
    try{
    n=Integer.parseInt(sca.readLine());
    }catch(Exception e){
	System.out.println(e);
    }
    String dic[] = new String[n];
    for(i=0;i<n;i++){
	try{
	sp=(sca.readLine()).split("[\\s]+");
	}catch(Exception e){
	    System.out.println(e);
	}
    	if(sp[0].equals("insert")){
	    dic[maxi]=sp[1];
	    maxi++;
    	}
    	if(sp[0].equals("find")){
	    for(j=0;j<maxi;j++){
		if(dic[j].equals(sp[1]))break;
	    }
    		if(j!=maxi){
    			System.out.println("yes");
    		}else{
    			System.out.println("no");
    		}
    	}
    }
	}

}
