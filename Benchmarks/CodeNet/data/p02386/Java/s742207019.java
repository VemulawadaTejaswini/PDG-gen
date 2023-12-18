import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		class qube{
			Scanner sc = new Scanner(System.in);
			Integer [] face = new Integer[6];
			ArrayList<Integer []> box = new ArrayList<>();
			Integer i,j,k,n=0,dump=0,check,st=101,nd=101;

			qube(){
				n = sc.nextInt();
			}
			void load(){
				for(i=0;i<6;i++){
					face[i] = sc.nextInt();
				}
				
				this.judge();
				for(k=0;;k++){
					if(this.face[1]==this.st){
						break;
					}
					this.move("N");
					if(this.k.equals(3)){
						this.move("E");
					}
				}
				while(true){
					if(this.face[0]==this.nd){
						break;
					}
					this.move("E");
				}
			}

			void swap(int a,int b){
				dump = this.face[a];
				this.face[a] = this.face[b];
				this.face[b] = dump;

			}
			void judge(){
				for(i=0;i<6;i++){
					if(st<face[i]) st = face[i];
				}
				for(i=0;i<6;i++){
					if(face[i] != st && nd<face[i]) nd = face[i];
				}
			}

			void move(String es){
				if(es.equals("E")){
					swap(0,2);
					swap(0,5);
					swap(0,3);
				}
				else if(es.equals("N")){
					swap(4,5);
					swap(4,1);
					swap(4,0);
				}

			}
			boolean comp(){
				check = 0;
				for(i=0;i<3;i++){
					for(j=0;j<3;j++){
						if(face[i]==face[j] && face[5-i]==face[5-j]){
							check++;
							break;
						}
					}
				}
				if(check == 3){
					return true;
				}
				else{
					return false;
				}
			}
		}
		Integer i;
		
		qube q = new qube();
		q.load();
		for(i=0;i<(q.n-1);i++){
			q.load();
			
		}
	}

}

