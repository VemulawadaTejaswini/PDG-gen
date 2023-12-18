import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder train = new StringBuilder();			
		StringBuilder[] organized = new StringBuilder[72*6];
		StringBuilder before = new StringBuilder();
		StringBuilder after = new StringBuilder();
		int data = sc.nextInt();

		for(int i=0; i<data; i++){
			train.append(sc.next());
			organized[0] = new StringBuilder();
			organized[0].append(train.toString());
			int j;
			for(j=1; j<train.length(); j++){
				before.append(train.substring(0, j));
				after.append(train.substring(j, train.length()));
				organized[(j-1)*6+1] = new StringBuilder();
				organized[(j-1)*6+1].append(after.toString()+before.toString());
				after.reverse();
				organized[(j-1)*6+2] = new StringBuilder();
				organized[(j-1)*6+2].append(before.toString()+after.toString());
				organized[(j-1)*6+3] = new StringBuilder();
				organized[(j-1)*6+3].append(after.toString()+before.toString());
				before.reverse();
				organized[(j-1)*6+4] = new StringBuilder();
				organized[(j-1)*6+4].append(before.toString()+after.toString());
				after.reverse();
				organized[(j-1)*6+5] = new StringBuilder();
				organized[(j-1)*6+5].append(before.toString()+after.toString());
				organized[j*6] = new StringBuilder();
				organized[j*6].append(after.toString()+before.toString());
				before.delete(0, before.length());
				after.delete(0, after.length());
			}
			organized[(j-1)*6+1] = new StringBuilder();
			organized[(j-1)*6+1].append((train.reverse()).toString());

			int cnt = 0;
			for(int m=0; m<=(j-1)*6+1; m++){
				int flag = 0;
				for(int n=m+1; n<=(j-1)*6+1; n++){
					if((organized[m].toString()).equals(organized[n].toString())){
						flag++;
						break;
					}
				}
				if(flag==0){
					cnt++;
				}
				organized[m].delete(0, organized[m].length());
			}
			System.out.println(cnt);
			train.delete(0, train.length());
		}
	}
}