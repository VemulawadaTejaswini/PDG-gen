import java.util.Scanner;

public class Main{
	public static String swap(String str){
		String[] s = new String[(str.length()+1)/2];
		StringBuilder sb = new StringBuilder();
		s = str.split(" ");
		int[] p = new int[s.length];
		for(int i = 0; i < s.length; i++){
			p[i] = Integer.parseInt(s[i]);
		}
		int key = -1;
		for(int i = p.length-1; i >= 0; i--){
			if( p[i] != 1 ){
				key = i;
				break;
			}
		}
		StringBuilder replace = new StringBuilder();
		if( key == p.length-1 ){
			replace.append(String.valueOf(p[p.length-1]-1) + " 1");
		} else {
			int count = p.length-1-key;
			int x = count+1;
			if( p[key]-1 < x ){
				x = p[key]-1;
			}
			replace.append(String.valueOf(p[key]-1) + " ");
			for(int i = 0; i < (count+1)/x; i++){
				replace.append(String.valueOf(x) + " ");
			}
			if( (count+1)%x != 0 ){
				replace.append(String.valueOf((count+1)%x) + " ");
			}
		}
		for(int i = 0; i < key; i++){
			sb.append(String.valueOf(p[i]) + " ");
		}
	//	sb.delete(2*key, str.length());
		sb.append(replace.toString());
		return sb.toString();
	}
			
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] n = new int[1000];
		int index = 0;
		
		for(int i = 0; i < 1000; i++){
			n[i] = stdIn.nextInt();
			if( n[i] == 0 ){
				break;
			}
			index++;
		}
		
		for(int i = 0; i < index; i++){
			String str = new String(String.valueOf(n[i]));
			System.out.println(str);
			if( str.equals("1") ){
				continue;
			}
			while( str.charAt(0) != '1' || str.charAt(1) != ' ' ){
				str = swap(str);
				System.out.println(str);
			/*	str = swap(str);
				System.out.println(str);
				str = swap(str);
				System.out.println(str);
				str = swap(str);
				System.out.println(str);
				str = swap(str);
				System.out.println(str);*/
		

			}
		
		}
	}
}