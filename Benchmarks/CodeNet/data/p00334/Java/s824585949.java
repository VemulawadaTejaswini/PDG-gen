import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;import java.util.Collections;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    ArrayList<Data> list=new ArrayList<>();
	    int count=Integer.parseInt(reader.readLine());
	    int duplicate=0;
	    for(int i=0;i<count;i++){
	    String str=reader.readLine();
	    String s[]=str.split(" ");
	    int w=Integer.parseInt(s[0]);
	    int h=Integer.parseInt(s[1]);
	    int c=Integer.parseInt(s[2]);

	    Data data=new Data(w,h,c);
	    for(int j=0;j<list.size();j++){
		if(list.get(j).search(data)){
			duplicate++;
			break;
		}
	    }
	    list.add(data);
	    }
	    
	    System.out.println(duplicate);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class Data{
	int num[]=new int[3];
	public Data(int a,int b,int c){
	    num[0]=a;
	    num[1]=b;
	    num[2]=c;
	}
	public boolean search(Data d){
	    int tr=0;
	    for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		    if(d.num[i]==num[j]){
			tr++;
		    }
		}
	    }
	    if(tr==3){
		return true;
	    }
	    return false;
	}
    }
}

