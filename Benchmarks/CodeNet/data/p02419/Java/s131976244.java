import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String w;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		w=scan.next().toLowerCase();
		while(true){
			String temp = scan.next();
			if(temp.equals("END_OF_TEXT")){
				break;
			}
			char[] c = temp.toLowerCase().toCharArray();
			temp="";
			for(int i = 0;i<c.length;i++){
				if(c[i]>='a'&&c[i]<='z'){
					temp+=c[i];
				}
			}
			if(temp.equals(w))
				count++;
		}
		scan.close();
		System.out.println(count);
	}
}
