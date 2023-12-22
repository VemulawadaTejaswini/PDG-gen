import java.io.*;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] Hills = new int[10];
		for (int i = 0; i < Hills.length; i++) {
			Hills[i] = Integer.parseInt(br.readLine());
		}
		int no1=0;
		int no2=0;
		int no3=0;
		
		for(int buf:Hills){
			if(no1<buf){
				no3=no2;
				no2=no1;
				no1=buf;
			}
			else if(no2<buf){
				no3=no2;
				no2=buf;
			}
			else if(no3<buf){
				no3 = buf;
			}
		}
		
		System.out.println(no1+"\n"+no2+"\n"+no3);

	}
}