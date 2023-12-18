import java.io.*;
port java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> stack=new LinkedList<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		String s;
		int n,t;
		try{
			while(true){
			while((s=reader.readLine()) !=null){
				n=Integer.parseInt(s);
				if(n ==0){
					t=stack.removeFirst();
					list.add(t);
				}else{
					stack.addFirst(n);
				}
				if(stack.size()==0){
					break;
				}
			}
			int x=list.size();
			int[] z=new int[x];
			for(int i=0;i<x;i++){
					z[i]=list.get(i);
			}
			for(int j=0;j<x;j++){
				System.out.println(z[j]);
			}
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
	}
}