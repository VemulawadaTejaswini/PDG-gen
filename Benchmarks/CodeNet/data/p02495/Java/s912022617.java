import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();

		String str;
		int h,w;

		try {
			while(true){
				str = br.readLine();

				if(str.equals("0 0"))
					break;

				if(!str.equals(""))
				list.add(str);
			}

			for(int i=0; i<list.size(); i++){
				h = Integer.parseInt((String)list.get(i).substring(0, str.indexOf(" ")));
				w = Integer.parseInt((String)list.get(i).substring(str.indexOf(" ")+1, str.length()));

				for(int j=0; j<h; j++){
					if(j%2 == 0){//奇数行
						for(int k=0; k<w; k++){
							if(k%2 == 0){//奇数列
								System.out.print("#");
							}else{//偶数列
								System.out.print(".");
							}
						}
					}else{
						for(int k=0; k<w; k++){
							if(k%2 == 1){//奇数列
								System.out.print("#");
							}else{//偶数列
								System.out.print(".");
							}
						}
					}System.out.println();
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}