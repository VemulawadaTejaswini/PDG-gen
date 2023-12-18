import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br =null;
	try{
	    br = new BufferedReader(new InputStreamReader(System.in));
	    while(true){
		int length =Integer.parseInt(br.readLine());
		if(length ==0)break;
		char[][] data = new char[length][];
		for(int i =0;i<length;i++)data[i]=br.readLine().toCharArray();
		int max = 0;
		for(int i = 0;i<length;i++){
		    if(max>i)break;
		    for(int j = 0;j<length;j++){
			if(max >j)break;
			    max = Math.max(max , calc(0,i,j,data));
		    }
		}
		System.out.println(String.valueOf(max));
		
	    }
	}finally{
	    if(br !=null)br.close();
	}
    }
    public static int calc(int start , int i, int j , char[][] data){
	boolean check =false;
	int length =data.length;
	if(((i + start) >length) || ((j+start) > length))return start;

	for(int k=0;k<=start;i++,j++,k++){
	    if(i+k<length || j+k<length)break;
	    if(data[i+start][j+k] =='*' || data[i+k][j+start]=='*'){
		check = true;
		break;
	    }
	}

	if(check)return start;
	else return calc(start + 1,i,j,data);
    }
}