import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arr = line.split(" ");
		int first = 0;
		int sec = 0;
		//System.out.println(Arrays.toString(arr));
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++) {
			try {
				st.push(Integer.parseInt(arr[i]));
			}
			catch(Exception e){
				if(arr[i].equals("+")) {
					sec = st.pop();
					first = st.pop();
					st.push(first + sec);
				}
				else if(arr[i].equals("-")) {
					sec = st.pop();
					first = st.pop();
					st.push(first - sec);
				}
				else if(arr[i].equals("*")) {
					sec = st.pop();
					first = st.pop();
					st.push(first * sec);
				}
			}
		}
		if(arr[arr.length-1].equals("+")) {
			System.out.println(first+sec);
		}
		else if(arr[arr.length-1].equals("-")) {
			System.out.println(first-sec);
		}
		else if(arr[arr.length-1].equals("*")) {
			System.out.println(first*sec);
		}
	}
}

