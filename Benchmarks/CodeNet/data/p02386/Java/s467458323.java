import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		class qube{
			Scanner sc = new Scanner(System.in);
			int [] face = new int[6],faces = new int[6];
			Integer i,j,n=0,dump=0,check;

			qube(){
				n = sc.nextInt();
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
			}
			void update(){
				for(i=0;i<6;i++){
					faces[i]=sc.nextInt();
				}
			}

			void swap(int a,int b){
				dump = this.faces[a];
				this.faces[a] = this.faces[b];
				this.faces[b] = dump;

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
						if(face[i]==faces[j] && face[5-i]==faces[5-j]){
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
		Integer j,k;

		qube q = new qube();
		for(j=0;j<(q.n-1);j++){
			q.update();
			for(k=0;;k++){
				if(q.faces[1]==q.face[1]){
					break;
				}
				q.move("N");
				if(k.equals(3)){
					q.move("E");
				}
			}
			for(k=0;;k++){
				if(q.faces[0]==q.face[0]){
					break;
				}
				if(k.equals(4)){
					break;
				}
				q.move("E");
			}
			if(q.comp() == true){
				System.out.println("No");
				System.exit(0);
			}
			else{
				continue;
			}
			
		}
		System.out.println("Yes");

	}

}
