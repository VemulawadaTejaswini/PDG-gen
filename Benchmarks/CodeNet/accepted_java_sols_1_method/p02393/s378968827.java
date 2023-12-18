
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	String[] str2 = str.split(" ",0);
	int[] num = new int[3];
	for (int i = 0; i < 3; i++) {
	    num[i] = Integer.parseInt(str2[i]);
	}
	int a,b,c,temp1,temp2;
	if (num[0]<=num[1]) {
	    temp1 = num[1];
	    temp2 = num[0];
	}
	else{
	    temp1 = num[0];
	    temp2 = num[1];
	}
	if (temp1<=num[2]) {
	    a = num[2];
	    b = temp1;
	    c = temp2;
	}
	else if (temp1>=num[2] && num[2] >=temp2) {
	    a = temp1;
	    b = num[2];
	    c = temp2;
	}
	else{
	    a = temp1;
	    b = temp2;
	    c = num[2];
	}
	System.out.println(c+" "+b+" "+a);	
    }
}