import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
//			while(sc.hasNextLine()){
//
//				String s = sc.nextLine();
//				if(s.equals("")) break;
//
//				int JOI=0;
//				int IOI=0;
//				for(int i=0;i<s.length();i++) {
//					if(s.indexOf("JOI",i)!=-1) {
//						JOI++;
//						i=s.indexOf("JOI",i)+1;
//					}
//				}
//
//				for(int i=0;i<s.length();i++) {
//					if(s.indexOf("IOI",i)!=-1) {
//						IOI++;
//						i=s.indexOf("IOI",i)+1;
//					}
//				}
//
//				System.out.println(JOI);
//				System.out.println(IOI);
//			}
//		}
//	}
////	black	00	00	00
////	blue	00	00	ff
////	lime	00	ff	00
////	aqua	00	ff	ff
////	red	ff	00	00
////	fuchsia	ff	00	ff
////	yellow	ff	ff	00
////	white	ff	ff	ff
//	static int[][] rgb = {
//			{0x00,0x00,0x00},
//			{0x00,0x00,0xff},
////			lime	00	ff	00
////			aqua	00	ff	ff
////			red	ff	00	00
////			fuchsia	ff	00	ff
////			yellow	ff	ff	00
////			white	ff	ff	ff
//
//	};
	//m n

		String s = sc.nextLine();
		String [] t = s.split(" ");
		String max = "";
		HashMap<String,Integer> count = new HashMap<>();
		for(String ss : t) {
			if(ss.length()>max.length()) {
				max = ss;
			}
			Integer n = count.get(ss);
			if(n == null) {
				count.put(ss, 1);
			}
			else {
				count.put(ss, n+1);
			}
		}
		String m="";
		int max2=0;
		for(String key: count.keySet()) {
			
			
			if(count.get(key)>max2) {
				max2=count.get(key);
				m=key;
			}
		}
		System.out.println(m+" "+max);
	}

	}
}

