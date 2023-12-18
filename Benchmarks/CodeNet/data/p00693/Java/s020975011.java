import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			String[] op = new String[n];
			String[] from = new String[n];
			String[] to = new String[n];

			for(int i=0;i<n;i++){
				op[i] = sc.next();
				from[i] = sc.next().replaceAll("\\?",".");
				to[i] = sc.next().replaceAll("\\?",".");
			}

			ArrayList<String> fromList = new ArrayList<String>();
			ArrayList<String> toList = new ArrayList<String>();
			ArrayList<String> mesList = new ArrayList<String>();

			for(int i=0;i<m;i++){
				String f = sc.next();
				String t = sc.next();
				String mes = sc.next();

				for(int j=n-1;j>=0;j--){
					if(f.matches(from[j]) && t.matches(to[j])){
						if(op[j].equals("permit")){
							fromList.add(f);
							toList.add(t);
							mesList.add(mes);
						}
						break;
					}
				}
			}

			int size = fromList.size();
			System.out.println(size);
			for(int i=0;i<size;i++){
				System.out.println(fromList.get(i) + " " + toList.get(i) + " " + mesList.get(i));
			}
		}
	}
}