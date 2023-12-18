import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		int n=Integer.parseInt(str);
		ArrayList<String> shape=new ArrayList<String>();
		ArrayList<Integer> number=new ArrayList<Integer>();
		for(int i=0;i<13;i++){
		shape.add("S");
		number.add(i+1);
		}
		for(int i=0;i<13;i++){
		shape.add("H");
		number.add(i+1);
		}
		for(int i=0;i<13;i++){
		shape.add("C");
		number.add(i+1);
		}
		for(int i=0;i<13;i++){
		shape.add("D");
		number.add(i+1);
		}
		ArrayList<String> shape2=new ArrayList<String>();
		ArrayList<Integer> number2=new ArrayList<Integer>();
	
		for(int i=0;i<n;i++){
		String str2=input.readLine();
		String[] arr=str2.split(" ");
		int num=Integer.parseInt(arr[1]);
		shape2.add(arr[0]);
		number2.add(num);
			for(int j=0;j<shape2.size();j++){
				if(shape.get(j).equals(shape2.get(i))&&number.get(j)==number2.get(i)){
					shape.remove(i);
					number.remove(i);
				}
			}
		}
		for(int i=0;i<shape.size();i++){
			System.out.println(shape.get(i)+" "+number.get(i));
		}
	}
}	