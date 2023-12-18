import java.util.*;

class Cake{
	int s,w,d;

	Cake(int tw,int td){
		w = tw;
		d = td;
		s = w * d;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			int n = scan.nextInt();
			int w = scan.nextInt();
			int d = scan.nextInt();
			if(n==0 && w==0 && d==0) break;

			ArrayList<Cake> al = new ArrayList<Cake>();
			Cake cake = new Cake(w,d);

			al.add(cake);

			while(n-- > 0){
				int p = scan.nextInt();
				int s = scan.nextInt();
				Cake cut1,cut2;

				cake = al.remove(p-1);
				int cutPlace = s % (cake.w + cake.d);

				if(cutPlace > cake.w){
					cut1 = new Cake(cake.w, cutPlace - cake.w);
					cut2 = new Cake(cake.w, cake.d - cut1.d);
				}
				else{
					cut1 = new Cake(cutPlace, cake.d);
					cut2 = new Cake(cake.w - cutPlace, cake.d);
				}

				if(cut1.s < cut2.s){
					al.add(cut1);
					al.add(cut2);
				}
				else{
					al.add(cut2);
					al.add(cut1);
				}
			}

			int size = al.size();
			int s[] = new int[size];

			for(int i=0;i<size;i++) s[i] = al.get(i).s;
			Arrays.sort(s);

			for(int i=0;i<size;i++){
				if(i != 0) System.out.print(" ");
				System.out.print(s[i]);
			}
			System.out.println();
		}
	}
}