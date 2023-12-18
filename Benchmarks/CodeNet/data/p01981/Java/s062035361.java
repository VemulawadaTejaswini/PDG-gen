import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    ArrayList<Date> date=new ArrayList<>();
	    while(true){
		String str=reader.readLine();
		if(str.equals("#")){
		    break;
		}
		String s[]=str.split(" ");
		String gen=s[0];
		int y=Integer.parseInt(s[1]);
		int m=Integer.parseInt(s[2]);
		int d=Integer.parseInt(s[3]);

		date.add(new Date(gen,y,m,d));
	    }
	    for(int i=0;i<date.size();i++){
		System.out.println(date.get(i).gen+" "+date.get(i).y+" "+date.get(i).m+" "+date.get(i).d);
	    }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class Date{
	String gen;
	int y;
	int m;
	int d;
	public Date(String gen,int y,int m,int d){
	    this.gen=gen;
	    this.y=y;
	    this.m=m;
	    this.d=d;
	    init();
	}
	void init(){
	    if(y>31||(y==31&&m>4)){
		gen="?";
		y=y-30;
	    }
	}
    }
}

