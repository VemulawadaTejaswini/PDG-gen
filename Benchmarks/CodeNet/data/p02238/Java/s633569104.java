
import java.io.*;
public class Main {
	String input = "";
	int output[][] = new int[100][2];//[ID][0]???d [ID][1]???f
	int intinput[][] = new int[100][100];
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int dataset = 0;
	int time = 1;
	public static void main(String []args){
		Main run = new Main();
		run.Run();
	}
	public void Run(){
		for(int z = 0;z < 100;z++){
			output[z][0] = -1;
			output[z][1] = -1;
		}try{
				input = read.readLine();
				if(dataset == 0)dataset = Integer.parseInt(input);
				for(int x = 0;x < dataset;x++){
					input = read.readLine();
					String[] get = input.split(" ");
					int number = 0,touch = 0;
					for(int y = 0; y < get.length; y++){
						if(y == 0)number = Integer.parseInt(get[y]);
						if(y >= 2){
							touch = Integer.parseInt(get[y]);
							intinput[number-1][touch-1] = 1;
						}
					}
				}
			}catch(Exception e){
				
			}
		Explore(1);
		for(int z = 0;z < dataset;z++){
			System.out.println((z+1)+" "+output[z][0]+" "+output[z][1]);
		}
	}
	public void Explore(int ID){//??¢?´¢ ID:??´???????±??????´???
		if(output[ID-1][0] == -1){//???????????????
			output[ID-1][0] = time;
		}
		for(int z = 0;z < dataset;z++){
			if(intinput[ID-1][z] == 1 &&
					output[z][0] == -1){//????????????????????????????????????
				time++;
				Explore(z+1);
			}if(z == dataset-1){//??????????????????????????¨???????????????????????????=??????
				time++;
				output[ID-1][1] = time;
			}
		}
	}
}