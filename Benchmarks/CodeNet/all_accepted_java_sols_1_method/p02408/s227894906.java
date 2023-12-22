public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int [] s = new int[13];
		int [] h = new int[13];
		int [] c = new int[13];
		int [] d = new int[13];

		for(int i = 0;i<n;i++){
			String t = scan.next();
			if("S".equals(t)){
				int j = scan.nextInt();
				s[j-1]++;
			}else if("H".equals(t)){
				int j = scan.nextInt();
				h[j-1]++;
			}else if("C".equals(t)){
				int j = scan.nextInt();
				c[j-1]++;
			}else if("D".equals(t)){
				int j = scan.nextInt();
				d[j-1]++;
			}
		}

		for(int i=0;i<13;i++){
			if(s[i] == 0){
				int t = i+1;
				System.out.println("S "+t);
			}
		}
		for(int i=0;i<13;i++){
			if(h[i] == 0){
				int t = i+1;
				System.out.println("H "+t);
			}
		}
		for(int i=0;i<13;i++){
			if(c[i] == 0){
				int t = i+1;
				System.out.println("C "+t);
			}
		}
		for(int i=0;i<13;i++){
			if(d[i] == 0){
				int t = i+1;
				System.out.println("D "+t);
			}
		}
	}
}