import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out);
		ArrayList<task> ar=new ArrayList<task>();
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]),q=Integer.parseInt(s[1]);
		for (int i=0;i<n;i++){
			ar.add(new task(br.readLine()));
		}
		int totaltime=0;
		while (!ar.isEmpty()){
			int tasktime=ar.get(0).gettime();
			if (tasktime>q){
				ar.get(0).timecut(q);
				ar.add(ar.get(0));
				ar.remove(0);
				totaltime+=q;
			}else {
				totaltime+=ar.get(0).gettime();
				pr.println(ar.get(0).getname()+" "+totaltime);
				ar.remove(0);
			}
		}
		pr.close();
	}
}

class task{
	private String name;
	private int time;
	public task(String str){
		String[] stmp=str.split(" ");
		this.name=stmp[0];
		this.time=Integer.parseInt(stmp[1]);
	}
	public String getname(){
		return this.name;
	}
	public int gettime(){
		return this.time;
	}
	public void timecut(int t){
		this.time-=t;
	}
}