
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<List<Integer>> A = new ArrayList<>();
		for(int i = 0 ;i<n;i++) {
			List<Integer> a = new ArrayList<>();
			A.add(a);
		}
		int q = sc.nextInt();
		for(int i = 0; i<q;i++) {
			int sentaku = sc.nextInt();
			int t = sc.nextInt();
			if(sentaku==0) {
				int x = sc.nextInt();
				List<Integer> a=A.get(t);
				a.add(x);
				
			}
			else if (sentaku == 1) {
				List<Integer> a=A.get(t);
                for(int j=0;j<a.size();j++){
                    System.out.print(a.get(j));
                    if(a.size()-j!=1)
                        System.out.print(" ");
                }
			
            System.out.println();
            }
			else if(sentaku==2){
				List<Integer> a=A.get(t);
				a.clear();
				
			}
			
		}

				sc.close();
	}
}
