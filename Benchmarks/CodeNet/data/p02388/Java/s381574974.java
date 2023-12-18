import java.io.*;

class prob11b{
    public static void main(String args[]){
	
 int aa , bb , cc  ;

        try {
            BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
            aa = Integer.parseInt(d.readLine());
	    bb = aa*aa*aa;
            System.out.println(bb);

        } catch (Exception e) {
            System.out.println("数字を　入れて　ください");
        }
	}
    }