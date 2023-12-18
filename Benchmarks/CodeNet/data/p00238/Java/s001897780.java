import java.io.*;

public class TimeToStudy{
    public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String tmp = br.readLine();
	while(tmp != null && Integer.parseInt(tmp) != 0){
	    int norma = Integer.parseInt(tmp);
	    int times = Integer.parseInt(br.readLine());
	    int actual = 0;
	    
	    for(int i = 0; i < times; i++){
		//args[++index] ??§???????????????????£??????§????????§??????????????????????????§????????§???nt?????§?????¶???
		String[] values = br.readLine().split(" " , 2);
		actual += Integer.parseInt(values[1])- Integer.parseInt(values[0]);
	    }

	    if(actual >= norma){
		System.out.println("OK");
	    }else{
		System.out.println(norma - actual);
	    }

	    tmp = br.readLine();
	}

	}catch(IOException e){
	    System.out.println(e);
	}
	
    }
}