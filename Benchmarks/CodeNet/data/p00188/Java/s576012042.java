import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
			}
			int ter = scan.nextInt();
			int count = 0;
			int min = 0;
			int max = n-1;
			while(true){
				if(a[(min+max)/2] == ter){
					count++;
					break;
				}
				if(min > max){
					break;
				}
				if(a[(min+max)/2] < ter){
					count++;
					min = (min+max)/2+1;
				}else{
					count++;
					max = (min+max)/2-1;
				}
			}
			System.out.println(count);
		}
	}
}