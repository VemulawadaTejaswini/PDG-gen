import java.io.*;

class prob11b{
    public static void main(String args[]){
	
 int x , bb;

        try {
            BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
            x = Integer.parseInt(d.readLine());
	    bb = x*x*x;
            System.out.println(bb);

        } catch (Exception e) {
        }
	}
    }