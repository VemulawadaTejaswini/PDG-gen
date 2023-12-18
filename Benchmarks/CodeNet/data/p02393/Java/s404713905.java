import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);

        if(b<a){
        	int d=a;
        	a=b;
        	b=d;
        }

        if(c<b){
        	int d=b;
        	b=c;
        	c=d;
        }

        System.out.println(a+" "+ b+" "+ c);
    }
}