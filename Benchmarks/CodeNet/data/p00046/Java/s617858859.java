import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		float syori=0;
		float max=0;
		float min=0;
		int counter=0;

	sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			syori=Float.parseFloat(str);
			if(counter==0) {
				min=syori;
				max=syori;
			}
			else {
				if(min>syori) {
					min=syori;
				}
				else if(max<syori) {
					max=syori;
				}
			}
			counter++;
		}
		System.out.println(max-min);
	}
}
