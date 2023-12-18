class AsciiCode
{
    String name;
    static HashMap<String,String> a2b;
    static HashMap<String,String> a2d;

    AsciiCode()
    {
	a2b = new HashMap<String,String>();
	a2d = new HashMap<String,String>();
	a2b.put("A","00000");
	a2b.put("B","00001");
	a2b.put("C","00010");
	a2b.put("D","00011");
	a2b.put("E","00100");
	a2b.put("F","00101");
	a2b.put("G","00110");
	a2b.put("H","00111");
	a2b.put("I","01000");
	a2b.put("J","01001");
	a2b.put("K","01010");
	a2b.put("L","01011");
	a2b.put("M","01100");
	a2b.put("N","01101");
	a2b.put("O","01110");
	a2b.put("P","01111");
	a2b.put("Q","10000");
	a2b.put("R","10001");
	a2b.put("S","10010");
	a2b.put("T","10011");
	a2b.put("U","10100");
	a2b.put("V","10101");
	a2b.put("W","10110");
	a2b.put("X","10111");
	a2b.put("Y","11000");
	a2b.put("Z","11001");
	a2b.put(" ","11010");
	a2b.put(".","11011");
	a2b.put(",","11100");
	a2b.put("-","11101");
	a2b.put("'","11110");
	a2b.put("?","11111");

	a2d.put("101",      " ");
	a2d.put("000000",   "'");
	a2d.put("000011",   "");
	a2d.put("10010001", "-");
	a2d.put("010001",   ".");
	a2d.put("000001",   "?");
	a2d.put("100101",   "A");
	a2d.put("10011010", "B");
	a2d.put("0101",     "C");
	a2d.put("0001",     "D");
	a2d.put("110",      "E");
	a2d.put("01001",    "F");
	a2d.put("10011011", "G");
	a2d.put("010000",   "H");
	a2d.put("0111",     "I");
	a2d.put("10011000", "J");
	a2d.put("0110",     "K");
	a2d.put("00100",    "L");
	a2d.put("10011001", "M");
	a2d.put("10011110", "N");
	a2d.put("00101",    "O");
	a2d.put("111",      "P");
	a2d.put("10011111", "Q");
	a2d.put("1000",     "R");
	a2d.put("00110",    "S");
	a2d.put("00111",    "T");
	a2d.put("10011100", "U");
	a2d.put("10011101", "V");
	a2d.put("000010",   "W");
	a2d.put("10010010", "X");
	a2d.put("10010011", "Y");
	a2d.put("10010000", "Z");
    }

    public static String s2c(String line)
    {
	String ans="";
	for (int i=0; i<line.length(); i++){
	    ans += a2b.get(line.substring(i,i+1));
	}

	return ans;
    }

    public static String decode(String bin0)
    {
	String bin=bin0;
	String t = "";
	while (bin.length()>0) {
	    for (int i=3; i<=8; i++){ 
		if (bin.length()>=i && a2d.containsKey(bin.substring(0, i))) {
		    t += a2d.get(bin.substring(0, i));
		    bin = bin.substring(i);
		    break;
		}
	    }
	    if (bin.length()<=8) {
		bin = "";
	    }
	}

	return t;
    }

}

public class Main
{
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	
	AsciiCode ac = new AsciiCode();
	while((line = br.readLine()) != null) {
	    String bin = ac.s2c(line);
	    String s =   ac.decode(bin);
	    System.out.println(s);
	}
    }
}