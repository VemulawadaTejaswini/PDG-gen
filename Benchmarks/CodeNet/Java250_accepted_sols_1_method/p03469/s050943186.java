import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		Scanner a = new Scanner(date).useDelimiter("/");
		int i = 0;
		String[] list = new String[3];
		while(a.hasNext()) {
			list[i] = a.next();
			i++;
		}
		if(!list[0].equals("2018"))
			list[0] = "2018";
		System.out.println(list[0] + "/"+list[1] +"/"+list[2]);
		
	}
}
