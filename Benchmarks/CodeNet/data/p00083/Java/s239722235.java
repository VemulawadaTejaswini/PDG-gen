import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			Date d = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());

			if(d.contains(new Date(1868,9,8),new Date(1912,7,29)))
				System.out.print("meiji " + (d.y - 1868 + 1));
			else if(d.contains(new Date(1912,7,30),new Date(1926,12,24)))
				System.out.print("taisho " + (d.y - 1912 + 1));
			else if(d.contains(new Date(1926,12,25),new Date(1989,1,7))){
				System.out.print("showa " + (d.y - 1926 + 1));
			}
			else if(d.contains(new Date(1989,1,8),new Date(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE))){
				System.out.print("heisei " + (d.y - 1989 + 1));
			}
			else{
				System.out.println("pre-meiji");
				continue;
			}

			System.out.println(" " + d.m + " " + d.d);
		}
	}
}

class Date{
	int y;
	int m;
	int d;

	Date(int y,int m,int d){
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public int compareTo(Date date){
		if(this.y != date.y) return this.y - date.y;
		if(this.m != date.m) return this.m - date.m;
		if(this.d != date.d) return this.d - date.d;
		return 0;
	}

	public boolean contains(Date d1,Date d2){
		if(this.compareTo(d1) >= 0 && this.compareTo(d2) <= 0)
			return true;
		else
			return false;
	}
}