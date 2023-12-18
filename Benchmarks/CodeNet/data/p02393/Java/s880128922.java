import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		int a = 0;
		for(int i=0;i<2;i++){
			for(int j=1;i+j<3;j++){
				if(num[i] < num[i+j]){
				}else	{
					a = num[i];
					num[i] = num[i+j];
					num[i+j] = a;
				}
			}
		System.out.print(num[i]+" ");
		}
		System.out.println(num[2]);
	}
}
