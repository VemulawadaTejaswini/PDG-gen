import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,tmp;
		int[] n = new int[990];
		String[] str = new String[990];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		for(i=0;i<1;i++){
			n[i] = Integer.parseInt(str[i]);
		}
		for(i=3;i<=n[0];i++){
			tmp = i;
			if(tmp%3==0){
				System.out.print(" "+i);
				continue;
			}
			else{
				while(tmp!=0){
					if(tmp%10==3){
						System.out.print(" "+i);
						break;
					}
					tmp/=10;
				}
			}
		} 
		System.out.println();
		System.out.flush();
	}
}