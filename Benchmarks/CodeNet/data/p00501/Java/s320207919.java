import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String data;
		int N = sc.nextInt();
		String name = sc.next();
		int i;
		int count = 0;
		for(i=0; i<N; i++){
			data = sc.next();
			B:for(int k=0; k <= (data.length() - name.length()); k++){
				String kanban = data.substring(k, k+1);
				String namae = name.substring(0, 0+1);
				if(kanban.equals(namae)){
					for(int m=k+1; m <= (data.length() - (name.length()-1)); m++){
						kanban = data.substring(m, m+1);
						namae = name.substring(1, 1+1);
						if(kanban.equals(namae)){
							int dist = m-k;
							if(check00(name, data, 1, m, dist)==1){
								count++;
								break B;
							}
							
						}
					}
				}
			}
		}
		System.out.println(count);
		return;
	}
	
	static int check00(String name, String data, int x, int y, int dist)
	{
		if(x==name.length()-1){
			return 1;
		}
		else if(y+dist >= data.length()){
			return 0;
		}
		String namae = name.substring((x+1), (x+1)+1);
		String kanban = data.substring((y+dist), (y+dist)+1);
		if(kanban.equals(namae)){
			return check00(name, data, x+1, y+dist, dist);
		}
		else{
			return 0;
		}
		
	}

}