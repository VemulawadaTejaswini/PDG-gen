import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Tenmou{
    public static void main (String[] args) {

	int n;
	int a,b,c;
	int x[];
	x= new int[3];
	String strbf;
	strbf = "0";
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try{
	      	strbf = br.readLine();
    	}catch(IOException e){
      		System.out.println("??\?????¨??????:" + e.getMessage());
    	}
	n = Integer.parseInt(strbf);
	String str[];
	str = new String[n];

	for(int i=0;i<n;i++){
    	try{
		a = Integer.parseInt(br.readLine());
    	}catch(IOException e){
      		System.out.println("??\?????¨??????:" + e.getMessage());
    	}
	try{
		b = Integer.parseInt(br.readLine());
    	}catch(IOException e){
      		System.out.println("??\?????¨??????:" + e.getMessage());
    	}
    	try{
		c = Integer.parseInt(br.readLine());
    	}catch(IOException e){
      		System.out.println("??\?????¨??????:" + e.getMessage());
    	}
	x[0]=Math.max(a,b);
	x[0]=Math.max(x[0],c);

	if(x[0]==a){
		x[1]=b;
		x[2]=c;
	}else if(x[0]==b){
		x[1]=a;
		x[2]=c;
	}else{
		x[1]=b;
		x[2]=a;
	}//if

	if((x[0]*x[0])==(x[1]*x[1]+x[2]*x[2])){
		str[i]="YES";
	}else{
		str[i]="NO";
	}//if
	}//for

	for(int i=0;i<n;i++){
				System.out.println(str[i]);
	}//for
}//method
}//class