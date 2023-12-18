import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		String[] ss = s.split(" ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(Integer.parseInt(ss[0]));
		al.add(Integer.parseInt(ss[1]));
		al.add(Integer.parseInt(ss[2]));
		Collections.sort(al);
		for(int i = 0;i < al.size();i++){
			System.out.print(al.get(i));
			if(i < al.size()-1){
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}

}