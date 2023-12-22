import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		String[] s=fs.readStringL();
		boolean slv=true;
		
		if(!s[0].equals("A")){
			slv=false;
		}
		
		if(s[1].equals(s[1].toUpperCase())){
			slv=false;
		}
		if(s[s.length-1].equals(s[s.length-1].toUpperCase())){
			slv=false;
		}
		
		int cntC=0;
		
		for(int i=2; i<s.length-1; i++){
			if(s[i].equals("C")){
				cntC+=1;
			}else if(s[i].equals(s[i].toUpperCase())){
				slv=false;
			}
		}
		
		if(cntC!=1){
			slv=false;
		}
		
		System.out.println(slv==true? "AC": "WA");
		
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		int readInt(){
			int i=Integer.parseInt(sc.nextLine());
			return i;
		}
		String[] readStringL(){
			String[] s=sc.nextLine().split("");
			return s;
		}
	}
}
