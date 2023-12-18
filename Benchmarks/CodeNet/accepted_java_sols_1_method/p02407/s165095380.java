import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        String str=array[N-1];
        for(int i=N-2;i>-1;i--) str+=" "+array[i];
        System.out.println(str);
	}
}