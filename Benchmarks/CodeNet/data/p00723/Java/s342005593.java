import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		for(int i=0; i<data; i++){
			StringBuilder train = new StringBuilder();
			train.append(sc.next());			
			StringBuilder[] organized = new StringBuilder[train.length()*6];
			organized[0] = new StringBuilder();
			organized[0].append(train.toString());
			int j;
			for(j=1; j<train.length(); j++){
				StringBuilder before = new StringBuilder();
				StringBuilder after = new StringBuilder();
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
			}
			System.out.println(cnt);
		}
	}
}