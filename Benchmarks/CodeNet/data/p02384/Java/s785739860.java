import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = buf.readLine().split(" ");
		String[] str1;
		int[] num = new int[6];
		int q;
		int top,front;
		int[] right;

		q = Integer.parseInt(buf.readLine());
		right = new int[q];
		for(int i=0; i<6; i++){
			num[i] = Integer.parseInt(str[i]);	
		}
		Saikoro sk = new Saikoro(num);
		for(int i=0; i<q; i++){
			str1 = buf.readLine().split(" ");
			top = Integer.parseInt(str1[0]);
			front = Integer.parseInt(str1[1]);		
			right[i] = sk.search_rigth(top,front);
		}
		for(int i=0; i<right.length; i++){
			System.out.println(right[i]);
		}

	}
}
class Saikoro{
	int[] num = new int[6];
	//?????????????????????
	//new???????????´????????????????????????????????????????????????????????????
	public Saikoro(int[] num){
		this.num[0] = num[0];
		this.num[1] = num[1];
		this.num[2] = num[2];
		this.num[3] = num[3]; 
		this.num[4] = num[4];
		this.num[5] = num[5];  
	}
	public int search_rigth(int top, int front){
		if(top == num[0]){
			if( front == num[1]) return num[2];
			if( front == num[2]) return num[4];
			if( front == num[3]) return num[1];
			if( front == num[4]) return num[3];
		}
		if(top == num[1]){
			if( front == num[0]) return num[3];
			if( front == num[2]) return num[0];
			if( front == num[3]) return num[5];
			if( front == num[5]) return num[2];
		}
		if(top == num[2]){
			if( front == num[0]) return num[1];
			if( front == num[1]) return num[5];
			if( front == num[4]) return num[0];
			if( front == num[5]) return num[4];
		}
		if(top == num[3]){
			if( front == num[0]) return num[4];
			if( front == num[1]) return num[0];
			if( front == num[4]) return num[5];
			if( front == num[5]) return num[1];
		}
		if(top == num[4]){
			if( front == num[0]) return num[2];
			if( front == num[2]) return num[5];
			if( front == num[3]) return num[0];
			if( front == num[5]) return num[3];
		}
		if(top == num[5]){
			if( front == num[1]) return num[3];
			if( front == num[2]) return num[1];
			if( front == num[3]) return num[4];
			if( front == num[4]) return num[2];
		}
		return 0;
	}

}