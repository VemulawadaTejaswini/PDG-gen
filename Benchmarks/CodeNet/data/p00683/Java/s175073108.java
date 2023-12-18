import java.util.*;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();
	sc.nextLine();
	for(int attend=0;attend<M;attend++){
	    StringBuffer str=new StringBuffer(sc.nextLine());
	    int cur=0;
	    int n=sc.nextInt();
	    String command1;
	    String command2;
	    sc.nextLine();
	    for(int i=0;i<n;i++){
		String command=sc.nextLine();
		//System.out.println(command);
		int index0=0;
		while(true){
		    if(command.charAt(index0)==' '){
			command1=command.substring(0,index0);
			command2=command.substring(index0+1);
			//System.out.println(command1);
			//System.out.println(command2);
			break;
		    }
		    index0++;
		}
		if("forward".equals(command1)){
		    if("char".equals(command2)){
			cur=cur<str.length()? cur+1:cur;    
		    }
		    else{
			int index=new String(str).indexOf(" ",cur+1);
			if(index==-1)cur=str.length();
			else{
			    while(true){
				if(cur==str.length())break;
				if(str.charAt(cur)!=' ')break;
				index++;
			    }
			    cur=index;
			}
		    }
		}
		if("backward".equals(command1)){
		    if("char".equals(command2)){
			cur=cur>0? cur-1:cur;    
		    }
		    else{
			int index=0;
			while(true){
			    int temp=new String(str).indexOf(" ",index+1);
			    if(temp>=cur||temp==-1)break;
			    index=temp;
			    //System.out.println(index);
			}
			cur=index;
		    }  
		}
		if("insert".equals(command1)){
		    //raplaceALL..
		    command2=new StringBuffer(command2).deleteCharAt(0).toString();
		    command2=new StringBuffer(command2).deleteCharAt(command2.length()-1).toString();
		    str.insert(cur,command2);
		    cur+=command2.length();
		}		       
		if("delete".equals(command1)){
		    if("char".equals(command2)){
			if(cur!=str.length()){
			    str.deleteCharAt(cur);
			}
		    }
		    else{
			while(true){
			    if(cur==str.length())break;
			    if(str.charAt(cur)!=' ')break;
			    str.deleteCharAt(cur);
			}
			while(true){
			    if(cur==str.length())break;
			    if(str.charAt(cur)==' ')break;
			    str.deleteCharAt(cur);
			}				
		    }
		}
	
		
	    }
	    print(str,cur);
	}
	
    }
    void print(StringBuffer str,int cur){
	    str.insert(cur,"^");
	    System.out.println(str);
	    str.deleteCharAt(cur);
    }
    public static void main(String[] args){
	new Main().run();
    }
}