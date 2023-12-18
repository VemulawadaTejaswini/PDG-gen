import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(scanner.nextLine());
		boolean[] dic = new boolean[(int) Math.pow(5, 12)];

		for(int i = 0; i < n; i++){
			char[] c = scanner.nextLine().toCharArray();

			if(c[0] == 'i'){
				dic[hash(Arrays.copyOfRange(c, 7, c.length))] = true;
			}else{
				if(dic[hash(Arrays.copyOfRange(c, 5, c.length))] == true){
					sb.append("yes\n");
				}else{
					sb.append("no\n");
				}
			}
		}
		System.out.print(sb);
	}

	public static int hash(char[] c){
		int a = 0;
		int hash = 0;
		for(int i = 0; i < c.length; i++){
			switch(c[i]){
				case 'A':
	                a = 1;
	                break;
            	case 'C':
	                a = 2;
	                break;
	            case 'G':
	                a = 3;
	                break;
	            default:
	                a = 4;
	                break; 
			}
			hash = hash*5 + a;
		}
		return hash;
	}
}