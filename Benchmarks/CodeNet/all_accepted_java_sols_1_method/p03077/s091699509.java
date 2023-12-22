import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long peopleNum=0;
		long moveMax[]=new long[5];
		long tmp=0;
		peopleNum=scanner.nextLong();
		for(int i=0;i<moveMax.length;i++) {
			moveMax[i]=scanner.nextLong();
		}
		for(int j=0;j<4;j++) {
		for(int i=0;i<4;i++) {
			if(moveMax[i]>moveMax[i+1]) {
				tmp=moveMax[i];
				moveMax[i]=moveMax[i+1];
				moveMax[i+1]=tmp;
			}
		}}
		long count=peopleNum/moveMax[0];
		if(peopleNum%moveMax[0]!=0) {
			count++;
		}
		System.out.println(count+4);
	}
}