import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    int count = 0;
	    int flag = 1;
	    while(null != (str = br.readLine())){
		int n = Integer.parseInt(str);
		if(n >= 2){
		    for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
			    if(i % j == 0){
				flag = 0;
				break;
			    }
			    else
				flag = 1;
			}
			if(flag == 1)
			    count++;
		    }
		    System.out.println(count);
		    count = 0;
		    flag = 1;
		}
		else
		    System.out.println("0");
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}