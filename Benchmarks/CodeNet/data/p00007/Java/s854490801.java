import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	buf=br.readLine();
	int n=Integer.parseInt(buf);
	int money=100000;
	double money2=money;
	for(int i=0;i<=n;i++){
	    money=money+(int)(money2*0.05);
	    money/=1000;
	    money*=1000;
	}
	System.out.println(money);
    }
}