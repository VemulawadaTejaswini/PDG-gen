import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		//long x=sc.nextLong();
		//long k=sc.nextLong();
		String s=sc.next();
		//String buff="";
		//long[] array=new long[n];
		int sum=0,buff,max=0,min=0;
		//int[] array=new int[l];
		//String s="",m="",h="";
		if(s.charAt(0)!='A' ||Character.isUpperCase(s.charAt(s.length()-1))||Character.isUpperCase(s.charAt(1))) {
			System.out.println("WA");
			System.exit(0);
		}
		for(int i=2;i<=s.length()-2;i++) {
			if(s.charAt(i)=='C') {
				sum++;
			}else if(Character.isUpperCase(s.charAt(i))){
				System.out.println("WA");
				System.exit(0);
			}

		}

		//Arrays.sort(array)
		if(sum!=1) {
			System.out.println("WA");
		}else {
			System.out.println("AC");
		}
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


