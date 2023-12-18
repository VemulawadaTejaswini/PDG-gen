import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i]= Integer.parseInt(s[i]);
		}
		
		int n2 = Integer.parseInt(sc2.nextLine());
		String[] s2 = sc2.nextLine().split("[\\s]+");
		int[] x2 = new int[n2];
		
		if(s2[0].equals("")){
			for(int i=0;i<n2;i++){
				x2[i] = Integer.parseInt(s2[i+1]);
			}
		}else{
			for(int i=0;i<n2;i++){
				x2[i] = Integer.parseInt(s2[i]);
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int h=0;h<n;h++){
			for(int g=0;g<n2;g++){
				if(x[h] == x2[g]) {
					if(list.contains(x[h])){
						break;
					}else{
						count++;
						list.add(x[h]);
					}
				}
			}
		}
		System.out.println(count);
	}
}