import java.io.*;
class Main{


    public static void main(String args[]) throws IOException{

	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    String s = sc.readLine();
	    if(s.equals("END OF INPUT"))break;
	    String[] sr = s.split(" ");
	    for(int i=0;i<sr.length;i++){
		System.out.print(sr[i].length());
	    }
	    System.out.println("");
	}
    }


}