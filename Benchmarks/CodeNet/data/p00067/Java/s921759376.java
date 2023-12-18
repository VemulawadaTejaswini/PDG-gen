import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		int g=0;
		int d = 0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<ArrayList> al2 = new ArrayList<ArrayList>();
		ArrayList<Integer> lsf = new ArrayList<Integer>();
		ArrayList<Integer> lsl = new ArrayList<Integer>();
		ArrayList<Integer> lsn = new ArrayList<Integer>();
		ArrayList<Integer> lsf2 = new ArrayList<Integer>();
		ArrayList<Integer> lsl2 = new ArrayList<Integer>();
		ArrayList<Integer> lsn2 = new ArrayList<Integer>();
		ArrayList<Integer> dead = new ArrayList<Integer>();
		
	}
	public static int trans(int h,int w){
		int ret = 0;
		
		ret = h*12+w;
		
		
		return ret;
		
	}

}