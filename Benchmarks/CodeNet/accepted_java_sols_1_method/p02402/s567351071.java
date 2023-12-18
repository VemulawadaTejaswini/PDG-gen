import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		int x,
		max=-1000000,
		min=1000000,
		temp;
		long sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		x = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");

		for(int i = 0; i < x; i ++){
			temp = Integer.parseInt(str[i]);
			if(temp>max){
				max = temp;
			}
			if(temp<min){
				min = temp;
			}
		sum = sum + temp;
		}
		System.out.println(min + " " + max + " " +sum);
  	}
}