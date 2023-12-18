import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		final int n=Integer.parseInt(br.readLine());
		HashSet<Integer> elements=new HashSet<Integer>();
		elements.add(0);
		String[] str=br.readLine().split(" ");
		for (int i=0;i<n;i++){
			int e=Integer.parseInt(str[i]);
			ArrayList<Integer> tmp=new ArrayList<Integer>(elements);
			int size=tmp.size();
			for (int j=0;j<size;j++){
				elements.add(e+tmp.get(j));
			}
		}
		final int q=Integer.parseInt(br.readLine());
		String[] que=br.readLine().split(" ");
		for (int i=0;i<q;i++){
			if (elements.contains(Integer.parseInt(que[i]))){
				System.out.println("yes");
			} else System.out.println("no");
		}
	}
}