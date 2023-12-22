import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = r.readLine();
        String[] sp = is.split(" ");
        if(sp.length > 3)
        	return;
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(sp[2]);
        if(a<b){
        	if(b<c){
        		System.out.println("Yes");
        	}else
            	System.out.println("No");
        }else
        	System.out.println("No");
      }
}