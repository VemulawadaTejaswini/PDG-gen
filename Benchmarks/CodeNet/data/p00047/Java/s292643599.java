import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] location=new int[3];
		location[0]=1;
		location[1]=0;
		location[2]=0;
		int alt;
		int[] number=new int[2];
		while((s=reader.readLine())!=null){
			if(s==""){break;}
			t=s.split(",");
			for(int i=0;i<2;i++){
				switch(t[i]){
					case"A":
						number[i]=0;
						break;
					case"B":
						number[i]=1;
						break;
					default:
						number[i]=2;
						break;
				}
			}
			alt=location[number[0]];
			location[number[0]]=location[number[1]];
			location[number[1]]=alt;
		}
			for(int j=0;j<3;j++){
				if(location[j]==1){
					switch(j){
						case 0:
							System.out.println("A");
							break;
						case 1:
							System.out.println("B");
							break;
						case 2:
							System.out.println("C");
							break;
					}
				}
			}
	}
}