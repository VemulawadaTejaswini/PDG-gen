import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        char[]list = sc.next().toCharArray();
        
        int count=0;
        for(int i=0; i<N-2; i++){
            if(list[i]=='A' && list[i+1]=='B' && list[i+2]=='C'){
                count++;
            }
        }
        System.out.println(count);
	}
}