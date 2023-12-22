import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{

	BufferedReader br = null;
	String buf;
	boolean line = true;
	try{
	    br = new BufferedReader(new InputStreamReader(System.in));
	    while((buf = br.readLine()) !=null){
		int[] year = new int[2];
		for(int i=0;i<year.length;i++){
		    year[i]= Integer.parseInt(buf.split(" ")[i]);
		}
		if(year[0] == year[1] && year[0] ==0)break;
		if(line){
		    line = false;
		}else{
		    System.out.println();}
		boolean check = false;
		for(int i = year[0];i<=year[1];i++){
		    if(i%4==0 && (i%100 != 0 || i%400 == 0)){
			check = true;
			System.out.printf("%d\n",i);
		    }
		}
		if(!check){
		    System.out.println("NA");
		}
	    }
	}finally{
	    if(br !=null){
		br.close();
	    }    
	}
    }   
}