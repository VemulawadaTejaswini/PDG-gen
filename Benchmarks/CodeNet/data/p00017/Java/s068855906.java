import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		String key_1 = "the",key_2 = "this" ,key_3 = "that";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String s= sc.nextLine();
			char[] c = s.toCharArray();
			for(int i=0;i<26;i++){
				for(int j=0;j<c.length;j++){
					 if (c[j] != ' ' && c[j] != '.'){
						 c[j]++;
						 if (c[j] > 'z') c[j] = (char)(c[j] - 26);
					 }
				}
				String _s = new String(c);
				if(_s.contains(key_1)) System.out.println(_s);
				else if(_s.contains(key_2)) System.out.println(_s);
				else if(_s.contains(key_3)) System.out.println(_s);
			}
		}
	}
}