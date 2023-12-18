import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	List<String> input=new ArrayList<String>();
	static String temp="A";
	
	
	
	void FT(String tmp){
		String []ans=tmp.split(",");
		if(temp.equals(ans[0])){
			temp=ans[1];
		}else if(temp.equals(ans[1])){
			temp=ans[0];
		}
		
	}
	public static void main(String[] args) {
		Main app=new Main();
		while(sc.hasNext())app.FT(sc.next());
		System.out.println(temp);
		
	}

}