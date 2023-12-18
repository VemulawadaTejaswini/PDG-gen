import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W=br.readLine();
        String[] T;
        int c=0;
        while(true){
        	T=br.readLine().split(" ");
        	if(T[0].equals("END_OF_TEXT")) break;
        	for(String str : T){
              if(str.equalsIgnoreCase(W)) c++;
            }
        }
        System.out.println(c);
	}
}