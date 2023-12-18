import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	
	while (scan.hasNext()) {
	    String line_top_gara = "#"; // 行頭の柄
	    int H = scan.nextInt();
	    int W = scan.nextInt();

	    if (0==H && 0==W)
		break;
	    
	    for (int i=0; i<H; i++) {
		String gara = line_top_gara;
		for (int j=0; j<W; j++) {
		    System.out.print(gara);
		    gara = alternate_gara(gara);
		}
		line_top_gara = alternate_gara(line_top_gara);
		System.out.print("\n");
	    }
	    System.out.print("\n");
	}
    }

    static private String alternate_gara(String s) {
	if (s.equals("#")) {
	    return ".";
	} else {
	    return "#";
	}
    }
}