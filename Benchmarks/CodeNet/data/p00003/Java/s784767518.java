import java.util.Scanner;
class Main{
    public static void main(String[] a){
		int num1[] = new int[1000];
		int num2[] = new int[1000];
		int num3[] = new int[1000];
		int num,i = 0;
		Scanner scanner = new Scanner(System.in);
		num = Integer.parseInt(scanner.next());
		for(i=0; i<num; i++) {
			num1[i] = Integer.parseInt(scanner.next());
			num2[i] = Integer.parseInt(scanner.next());
			num3[i] = Integer.parseInt(scanner.next());
			if((Math.pow(num1[i], 2) + Math.pow(num2[i], 2) == Math.pow(num3[i], 2))
					|| (Math.pow(num1[i], 2) + Math.pow(num3[i], 2) == Math.pow(num2[i], 2))
					|| (Math.pow(num2[i], 2) + Math.pow(num3[i], 2) == Math.pow(num1[i], 2))){
				System.out.println("YES");
			} else{
				System.out.println("NO");	
			} 
		}
		scanner.close();
    }
}
