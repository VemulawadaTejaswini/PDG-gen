import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iil = 0;
		int iir = 0;
		int retsum = 0;
		for(int i=0;i<iin;i++){
			iil = sc.nextInt();
			iir = sc.nextInt();
			retsum += iir - iil + 1;
		}
		System.out.println(retsum);
    }
}
