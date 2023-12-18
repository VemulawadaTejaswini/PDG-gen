import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] p = new int[5];
			p[0] = scan.nextInt();
			if(p[0] == 0){
				break;
			}
			int[] t = new int[3];
			t[p[0]-1]++;
			for(int i = 1;i < 5;i++){
				p[i] = scan.nextInt();
				t[p[i]-1]++;
			}
			if(t[0] != 0 && t[1] != 0 && t[2] != 0){
				t[0] = t[1] = t[2] = 3;
			}else if(t[0] != 0 && t[1] != 0){
				t[0] = 1;
				t[1] = 2;
			}else if(t[0] != 0 && t[2] != 0){
				t[0] = 2;
				t[2] = 1;
			}else if(t[1] != 0 && t[2] != 0){
				t[1] = 1;
				t[2] = 2;
			}else if(t[0] != 0 || t[1] != 0 || t[2] != 0){
				t[0] = t[1] = t[2] =3;
			}
			for(int i = 0;i < 5;i++){
				System.out.println(t[p[i]-1]);
			}
		}
	}
}