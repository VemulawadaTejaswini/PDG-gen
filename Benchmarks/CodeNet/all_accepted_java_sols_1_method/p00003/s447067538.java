import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	String str;
	try{
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    String[] strary = new String[3];
	    int[] len = new int[3];
	    int temp;
	    str = br.readLine();
	    int count = Integer.parseInt(str);
	    while((count--) != 0){
		str = br.readLine();
		strary = str.split(" ");
		for(int i=0;i<3;i++){
		    len[i] = Integer.parseInt(strary[i]);
		}
		if(len[0] > len[1]){
		    temp = len[0];
		    len[0] = len[1];
		    len[1] = temp;
		}
		if(len[1] > len[2]){
		    temp = len[1];
		    len[1] = len[2];
		    len[2] = temp;
		}
		if((len[0]*len[0] + len[1]*len[1]) == (len[2]*len[2]))
		    System.out.println("YES");
		else
		    System.out.println("NO");
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}