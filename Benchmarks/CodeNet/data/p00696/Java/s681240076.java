import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int col = sc.nextInt();
			int width = sc.nextInt();
			int space = sc.nextInt();
			sc.nextLine();
			ArrayList<String> list = new ArrayList<String>();
			while(true){
				String str = sc.nextLine();
				if(str.equals("?")) break;
				if(str.equals("")){
					StringBuilder sb = new StringBuilder();
					for(int i = 0; i < width; i++){
						sb.append(".");
					}
					list.add(sb.toString());
					continue;
				}
				for(int i = 0; i < str.length(); i+= width){
					String data = str.substring(i, Math.min(i + width, str.length()));
					StringBuilder sb = new StringBuilder(data);
					for(int j = data.length(); j < width; j++){
						sb.append(".");
					}
					list.add(sb.toString());
				}
			}
			
			StringBuilder emptystr = new StringBuilder();
			for(int i = 0; i < width; i++){
				emptystr.append(".");
			}
			StringBuilder spacestr = new StringBuilder();
			for(int i = 0; i < space; i++){
				spacestr.append(".");
			}
			
			for(int i = 0; i < list.size(); i+= n * col){
				for(int j = 0; j < n; j++){
					for(int k = 0; k < col; k++){
						int ind = i + j + k * n;
						if(ind >= list.size()){
							System.out.print(emptystr.toString());
						}
						else{
							String print = list.get(ind);
							System.out.print(print);
						}
						if(k != col - 1){
							System.out.print(spacestr);
						}
					}
					System.out.println();
				}
				System.out.println("#");
			}
			System.out.println("?");
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}