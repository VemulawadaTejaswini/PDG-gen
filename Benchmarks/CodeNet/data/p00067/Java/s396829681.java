import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		int g=0;
		int d = 0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<tyu> al2 = new ArrayList<tyu>();
		ArrayList<Integer> lsf = new ArrayList<Integer>();
		ArrayList<Integer> lsl = new ArrayList<Integer>();
		ArrayList<Integer> lsn = new ArrayList<Integer>();
		ArrayList<Integer> lsf2 = new ArrayList<Integer>();
		ArrayList<Integer> lsl2 = new ArrayList<Integer>();
		ArrayList<Integer> lsn2 = new ArrayList<Integer>();
		ArrayList<Integer> dead = new ArrayList<Integer>();

		while(true){
			tyu io = new tyu();
			for(int s=0;s<12;s++){
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				if(tes == null){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				if(tes.equals("")){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				g = 0;
				try{
					
					for(int i=0;i<12;i++){
						io.t.add(Integer.parseInt(String.valueOf(tes.charAt(i))));
						dead.add(0);
					}
				}catch(NumberFormatException e){
					break;
				}
			}
			if(d == 1){
				break;
			}
			al2.add(io);

			//al.add(a);
		}
		
		/*for(int i=0;i<al2.size();i++){
			for(int j=0;j<12;j++){
				for(int k=0;k<12;k++){
					System.out.print(al2.get(i).get(trans(j,k)));
				}
				System.out.println();
			}
			System.out.println("\n");
		}*/
		
		int num;
		int cl;
		int yn;
		
		al = al2.get(0).t;
System.out.println("aaaaaaaaaaaaaaaaa");

		
	}
	public static int trans(int h,int w){
		int ret = 0;
		
		ret = h*12+w;
		
		
		return ret;
		
	}

}
class tyu{
	ArrayList<Integer> t = new ArrayList<Integer>();
	
}