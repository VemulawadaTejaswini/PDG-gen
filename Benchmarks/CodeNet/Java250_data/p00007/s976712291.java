import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	buf=br.readLine();
	int n=Integer.parseInt(buf);
	int money=100000;
	for(int i=1;i<=n;i++){
	    money*=1.05;
	    if(money%1000>0){
		money/=1000;
		money++;
	    }else{
		money/=1000;
	    }
	    money*=1000;
	}
	System.out.println(money);
    }
}