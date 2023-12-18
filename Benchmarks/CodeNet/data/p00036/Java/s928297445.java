import java.io.*;
import java.util.*;
import java.math.*;

class Main{

	public static void check_figure(ArrayList<String> list){
		String str="",chstr="";
		char ch;
		boolean check = false;
		int count = 0,fig;
		
		
		
		for(int i=0;i<8;i++){
			str = list.get(i);
			char[] strAry = str.toCharArray();
			
			for(int j=0;j<strAry.length;j++){
				ch = strAry[j];
				if(check == true)
					count++;
				if(ch=='1' && check == false)
					check = true;
				else if(ch=='1'){
					chstr += count;
				}
			}
		}
		
		fig = Integer.valueOf(chstr).intValue();
		
		switch(fig){
			case 189: System.out.println("A"); break;
			case 81624: System.out.println("B"); break;
			case 123: System.out.println("C"); break;
			case 7815: System.out.println("D"); break;
			case 1910: System.out.println("E"); break;
			case 8917: System.out.println("F"); break;
			default: System.out.println("G"); break;
		}
		
	}

	public static void print_figure(ArrayList<String> list){
		ArrayList <String> inp = new ArrayList<String>();
		
		for(int i=0;i<list.size()/8;i++){
			for(int j=0;j<8;j++){
				inp.add(list.get(i*8+j));
			}
			check_figure(inp);
			inp.clear();
		}
		
	}
		
	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <String> inp = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			str = scan.next();
			inp.add(str);
		}
		print_figure(inp);
	}
}