import java.util.*;

public class Main {
	
	private static int[] list;
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		int w = sc.nextInt();
		int n = sc.nextInt();
		w++;

		//initialization
		list = new int[w];
		for(int i=1;i<w;i++){list[i]=i;}
		
		//calculation
		String[] s;
		for(int i=0;i<n;i++){
			s = sc.next().split(",");
			swap(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
		}

	    //output
		for(int i=1;i<w;i++){System.out.println(list[i]);}
	}
	
	private static void swap(int a,int b){
		list[b] = list[a] - list[b];
		list[a] -= list[b];
		list[b] += list[a];
	}
}