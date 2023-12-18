import java.util.Scanner;
class Main {
	public static void main(String[] args){
		String[] str = new String[2];
		int sum=0,ave=0,count=0,n,m;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			str = sc.nextLine().split(",");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			sum += n*m;
			ave += m;
			count++;
		}
		ave = (int)Math.round((double)ave/count);
		System.out.println(sum);
		System.out.println(ave);
	}
}