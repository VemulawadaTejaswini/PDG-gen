import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] st = str.split("[\\s]+");
		
		int count = 0;
		
		for(int i = 0; i < st.length-1; i++)
			if(st[i].length() < st[i+1].length())count = i+1;
		
		int fuck = 0;
		int[] a = new int[st.length];
		
		for(int i = 0; i < st.length; i++)
			for(int j = i; j < st.length; j++)
				if(i != j)
				if(st[i].contains(st[j]))a[i]++;
		
		for(int i = 0; i < st.length-1; i++)
			if(a[i] < a[i+1])fuck = i+1;
			
		System.out.println(st[fuck] + " " + st[count]);
		
		sc.close();
	}
}