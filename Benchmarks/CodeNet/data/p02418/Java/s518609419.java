import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char[]a=sc.next().toCharArray();
			char []b=sc.next().toCharArray();
			boolean judge=false;
			int count=0;
			for(int i=0;i<a.length;i++){
				if(judge&&i==a.length-1){
					i=0;
				}else if(judge) {
					break;
				}
				if(judge&&a[i]!=b[count]){
					judge=false;
					break;
				}
				if(a[i]==b[count]){
					count++;
					judge=true;
				}

				if(count==b.length-1){
					break;
				}

			}
			if(judge){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}