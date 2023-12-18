import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
   public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> Dic = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String[] meirei = br.readLine().split(" ");
			
			if(meirei[0].equals("insert")){
				Dic.add(meirei[1]);
			}else{
				if(Dic.contains(meirei[1])){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}
}