import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String array[] = str.split(" ");
		
		int[] a = new int[3];
		
		for(int i = 0; i<array.length; i++){
			a[i] = Integer.parseInt(array[i]);
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = a.length-1; j>i; j--) {
				if (a[j] < a[j-1]) {
					int x = a[j-1];
					a[j-1] = a[j]; 
					a[j] = x;
				}
			}
		}
		
		/*
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		*/
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		
	}

}