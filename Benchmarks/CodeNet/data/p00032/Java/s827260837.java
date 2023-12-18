import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int rectangle = 0;//長方形
			int diamond = 0;//菱形
			List<String> dataList = new ArrayList<String>();
			while(stdIn.hasNext()){
				dataList.add(stdIn.next());
			}
			for(String i:dataList){
				String[] data = i.split(",");
				if(data[0] == data[1]){
					rectangle++;
				}else if(Integer.valueOf(data[0]) * Integer.valueOf(data[0]) + Integer.valueOf(data[1]) * Integer.valueOf(data[1]) == Integer.valueOf(data[2]) * Integer.valueOf(data[2])){
						diamond++;
				}
			System.out.println(rectangle + "\n" + diamond);
			}
		}
	}
}