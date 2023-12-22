import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		Input input = new Input();
		Converter conv = new Converter();
		String a[]= conv.strArr_(input.input(), "");
		String b[] = conv.strArr_(input.input(), "");
		String c[] = conv.strArr_(input.input(), "");
		int asize = a.length,bsize = b.length,csize = c.length;
		int acount=0,bcount=0,ccount=0;

		String index = a[0];
		acount++ ;

		while(acount<=asize && bcount<=bsize && ccount<=csize) {
			switch(index) {
			case "a":
				if(acount == asize) {
					System.out.println("A");
					acount++;
				}else{
					index = a[acount];
					acount++;
					}
				break;

			case "b":
				if(bcount == bsize) {
					System.out.println("B");
					bcount++;
				}else{
					index = b[bcount];
					bcount++;
					}
				break;

			case "c":
				if(ccount == csize) {
					System.out.println("C");
					ccount++;
				}else{
					index = c[ccount];
					ccount++;
					}
				break;
			}
		}
		}
	}


class Input{

	private String buf;
	BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
	
    public String input() {
	try{
		this.buf = bufferdReader.readLine();
	}catch(Exception e) {
	}
	return buf;
	}
}


class Converter{

	private int convInt=0;
	private String convStrArr[];

	public int int_(String convInt){
		this.convInt = Integer.parseInt(convInt);
		return this.convInt;
	}

	public String[] strArr_(String convStrArr,String breakStr){
		this.convStrArr = convStrArr.split(breakStr,0);
		return this.convStrArr;
	}
}
