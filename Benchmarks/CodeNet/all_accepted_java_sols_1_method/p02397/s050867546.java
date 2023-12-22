import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder=new StringBuilder();
		String[] str=new String[2];
		int x, y, z;

		try{
			while(true){
				str=reader.readLine().split(" ");
				x=Integer.parseInt(str[0]);
				y=Integer.parseInt(str[1]);
				if(x==0&&y==0)break;
				else{
					if(x>y){
						z=x;
						x=y;
						y=z;
					}
					builder.append(Integer.toString(x)).append(" ").append(Integer.toString(y)).append("\n");
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.print(builder);
	}
}