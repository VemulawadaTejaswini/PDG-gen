import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main();
		test.run();
	}
	
	void run(){
		final BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			int[] indata = null;
			try{
				indata = changeData(in.readLine());
			}catch(IOException e){
			}
			
			if(!checkData(indata))break;
		}while(true);		
	}
	
	int[] changeData(String data){
		String[] elem = data.split(" ");
		int[] datas = new int[elem.length];
		for (int i = 0; i < elem.length; i++){
			datas[i] = Integer.parseInt(elem[i]);
		}
		return datas;
	}
	boolean checkData(int[] data){
		if (data[0]==0 && data[1]==0) return false;
		System.out.println(countData(data[0],data[1]));
		return true;
	}
	
	int countData(int a, int b){
		int count=0;
		for(int i=1; i<=a; i++)
			for(int j=i+1; j<=a; j++)
				for(int k=j+1; k<=a; k++)
					if (i+j+k == b)count ++;
		return count;
	}
}