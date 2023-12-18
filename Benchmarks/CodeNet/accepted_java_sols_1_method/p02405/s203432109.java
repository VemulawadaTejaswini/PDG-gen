import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true){
		String str=input.readLine();
		String[] arr=str.split(" ");
		int h=Integer.parseInt(arr[0]);	
		int w=Integer.parseInt(arr[1]);
		if(h==0&&w==0){
			break;
		}
	
		for(int i=0;i<h;i++){

			for(int j=0;j<w;j++){
				if(i%2==0){
					if(j%2==0){
						sb.append("#");
					}else{
						sb.append(".");
						}
					}

				if(i%2==1){
					if(j%2==1){
						sb.append("#");
					}else{
						sb.append(".");
					}
				}
			}
			
				sb.append("\n");
		}
			sb.append("\n");

	}
		
		
		
		System.out.print(sb);
	}
}