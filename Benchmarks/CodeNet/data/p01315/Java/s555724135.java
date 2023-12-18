import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
	static class Plant{
		String name;
		int P, A, B, C, D, E, F, S, M;
		int rieki;
		double efficience;
		Plant(String str, int p, int a, int b, int c, int d, int e, int f, int s, int m){
			name = str;
			P = p;
			A = a;
			B = b;
			C = c;
			D = d;
			E = e;
			F = f;
			S = s;
			M = m;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plant[] plants = new Plant[50];

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			int time = 0;
			for(int i=0; i<data; i++){
				plants[i] = new Plant(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
									  sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				time = plants[i].A + plants[i].B + plants[i].C;
				for(int j=0; j<plants[i].M; j++){
					time += plants[i].D + plants[i].E + plants[i].F;
				}
				plants[i].rieki = plants[i].M * plants[i].F * plants[i].S - plants[i].P;
				plants[i].efficience = (double)plants[i].rieki / time;
			}

			Arrays.sort(plants, 0, data, new Comparator<Plant>(){
				public int compare(Plant a, Plant b){
					if(a.efficience - b.efficience>0){
						return -1;
					}else if(a.efficience - b.efficience<0){
						return 1;
					}else{
						return a.name.compareTo(b.name);
					}
				}
			});

			for(int i=0; i<data; i++){
				System.out.println(plants[i].name);
			}
			System.out.println("#");
		}
	}
}