import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    ArrayList<Double> num = new ArrayList<Double>();
	    while((st=sc.readLine())!=null)
		num.add(Double.valueOf(st));
	    double[] ini = new double[num.size()];
	    for(int i=0; i<ini.length; i++)
		ini[i] = num.get(i);
	    Arrays.sort(ini);
	    System.out.println(ini[ini.length-1]-ini[0]);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}