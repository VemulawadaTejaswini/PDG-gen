import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		String str;
		ArrayList<String> list = new ArrayList<String>();
		String[] s;
		int h,w;
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(int i=0; i<list.size(); i++){
			s = list.get(i).split(" ");
			h = Integer.parseInt(s[0]);
			w = Integer.parseInt(s[1]);

			if(h==0&&w==0){break;}

			draw(h,w);						//描画
			System.out.println(""); 		//改行
		}
	}

	public static void draw(int h,int w){	//[#]=false,[.]=true
		boolean hflag=false,wflag=false;

		for(int i=0; i<h; i++){
			if(!hflag) {
				wflag = false; hflag=true;
			}else{
				wflag = true;  hflag=false;
			}

			for(int j=0; j<w; j++){
				if(wflag) {
					System.out.print("."); wflag=false;
				}else{
					System.out.print("#"); wflag=true;
				}
			}
			System.out.println("");			//改行
		}
	}
}