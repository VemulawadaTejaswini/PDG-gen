import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{

	BufferedReader br = null;
	String buf;
	try{
	    br = new BufferedReader(new InputStreamReader(System.in));
	    while((buf = br.readLine()) !=null){
		int[] year = new int[2];
		for(int i=0;year.length;i++){
		    year[i]= Integer.parseInt(buf.split(" "));
		}
		boolean check = false;
		for(int i = year[0];i<year[1];i++){
		    if(i%4==0 && (i%100 !=0 || i%400 ==0)){
			check = true;
			System.out.printf("%d\n",year);
		    }
		}
		System.out.println();
	    }
	}finally{
	    if(br !=null){
		br.close();
	    }
	}
    }
}
	    