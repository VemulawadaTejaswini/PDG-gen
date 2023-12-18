import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		String[] str;
		String str1,str2;
		char[] c1;
		char[] c2;
		int tarou=0;
		int hanako=0;
		int j=0;

		for(int i=0; i<n; i++){
			str = buf.readLine().split(" ");
			c1 = str[0].toCharArray();
			c2 = str[1].toCharArray();
			while(true){
				if(str[0].equals(str[1])){
					tarou++;
					hanako++;
					break;
				}
				else{
					if((int)c1[j] > (int)c2[j]){
						tarou += 3;
						break;
					}
					else if((int)c1[j] < (int)c2[j]){
						hanako += 3;
						break;
					}
					else
						j++;
				}
				
			}
			j=0;
			
		}
		System.out.println(tarou + " " + hanako);
	}
}