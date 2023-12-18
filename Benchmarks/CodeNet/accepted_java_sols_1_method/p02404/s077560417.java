import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		
		while(true){
			String str = br.readLine();
			if("0 0".equals(str)) break;
			list.add(str);
		}
		for(int i = 0 ; i <list.size() ; i++){
			String[] stra = list.get(i).split(" ");
			int h = Integer.parseInt(stra[0]);
			int w = Integer.parseInt(stra[1]);
			for (int j = 0 ; j < h ;j++){
				if( j == 0 || j == h-1 ){
					for(int k = 0 ; k < w ; k++){
						System.out.print("#");
					}
					System.out.println();
				}else{
					System.out.print("#");
					for(int l = 0 ; l < w-2 ; l++){
						System.out.print(".");
					}
					System.out.print("#");
					System.out.println();
				}
			}
			System.out.println();
		}
	}

}