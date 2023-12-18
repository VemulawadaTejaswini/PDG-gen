import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = 0;
			ArrayList<Integer> al = new ArrayList();
			for(int i = 0; i < 10; i++){
				a = sc.nextInt();
				al.add(a);
			}
			for(int o = 0; o < 9; o++){
				a = al.size();
			for(int i = 0; i < al.size(); i++){
				al.add(al.get(i)+al.get(i+1));
			}
			for(int u = 0; u < a; u++){
				al.remove(0);
			}
			}
			System.out.println(al.get(al.size()-1));
		}
	}
}