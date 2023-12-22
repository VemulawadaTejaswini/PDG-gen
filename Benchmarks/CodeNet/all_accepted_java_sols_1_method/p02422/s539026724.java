import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String str = "";
		String mei = "";
		String fro = "";
		String bac = "";
		String mew = "";
		String out = "";
		int q = 0;
		int a = 0;
		int b = 0;
		
		str = as.nextLine();
		q = as.nextInt();
		
		for(int i=0;i<q;i++){
			
			mei = as.next();
			
			switch(mei){
			case "print":
				a = as.nextInt();
				b = as.nextInt();
				
				out = str.substring(a,b+1);
				System.out.println(out);
				break;
			
			case "reverse":
				a = as.nextInt();
				b = as.nextInt();
				
				bac = str.substring(b+1,str.length());
				//System.out.println(bac);
				fro = str.substring(0,a);
				//System.out.println(fro);
				str = str.substring(a,b+1);
				//System.out.println(str);
				
				StringBuffer sb = new StringBuffer(str);
				str = sb.reverse().toString();
				
				str = fro+str+bac;
				//System.out.println("!!"+str);
				break;
				
			case "replace":
				a = as.nextInt();
				b = as.nextInt();
				mew = as.next();
				
				StringBuffer sc = new StringBuffer(str);
				str = sc.replace(a, b+1, mew).toString();
				//System.out.println(str);
				break;
			
			
			}
			
		}

	}

}