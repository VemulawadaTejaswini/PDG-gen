import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int x=Integer.parseInt(br.readLine());
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			//System.out.println(list);
			String s=br.readLine();
			String[] v=s.split(" ");
			if(v[0].equals("insert")){
				int val=Integer.parseInt(v[1]);
				list.add(0,val);
			}else if(v[0].equals("delete")){
				int val=Integer.parseInt(v[1]);
				for (int j = 0; j < list.size(); j++) {
					if(list.get(j)==val){
						list.remove(j);
						break;
					}
				}
				
			}else if(v[0].equals("deleteFirst")){
				list.remove(0);
				
			}else if(v[0].equals("deleteLast")){
				int size=list.size()-1;
				list.remove(size);
			}
		}
		int size=list.size();
		for (int i = 0; i <size ; i++) {
			System.out.print(list.get(i));
			if(i<size-1)
				System.out.print(" ");
		}
		System.out.println();

	}

}