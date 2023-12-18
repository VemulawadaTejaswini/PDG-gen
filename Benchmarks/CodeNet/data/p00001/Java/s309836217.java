import java.io.IOException;
class Main {
	public static void main(String[] args) throws IOException{
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		
		int top3[] = new int[]{0,0,0,0};
		
		for(int i=0;i<10;i++){
			int height = Integer.parseInt(in.readLine());
			for(int j=2;j>=0;j--){
				if(height > top3[j]){
					top3[j+1] = top3[j];
					top3[j] = height;
				}else{
					break;
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(top3[i]);
		}
	}
}