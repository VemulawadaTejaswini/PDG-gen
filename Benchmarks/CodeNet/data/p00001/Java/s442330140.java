import java.io.*;
class hills{
    public static void main(String args[]){
	String buf = "";
	int save;
	int n = 10;
	int data[];
	data = new int[10];
	BufferedReader lineread = new BufferedReader(
new InputStreamReader(System.in));
	for(int i=0;i<10;i++){
	    int a =i+1;
	    System.out.println("第"+a+"の山の高さを入力しなさい");
	    try{
		buf = lineread.readLine();
	    }catch(IOException e){}
	    data[i] = new Integer(buf).intValue();
	}
	for(int i=n-2;i>=0;i--){
	    for(int j=0; j<=i; j++)
		if(data[j]>data[j+1]){
		    save = data[j]; data[j] = data[j+1];data[j+1] = save;
		}
	}
	System.out.println(data[9]);
	System.out.println(data[8]);
	System.out.println(data[7]);
    }
}