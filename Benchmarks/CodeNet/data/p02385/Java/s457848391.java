import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		class qube{
			int [] face = new int[6], faces = new int[6];
			Integer i,j,dump=0,check = 0;


			qube(){
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
				for(i=0;i<6;i++){
					faces[i]=sc.nextInt();
				}

			}
			void swap(int a,int b){
				dump = this.face[a];
				this.face[a] = this.face[b];
				this.face[b] = dump;

			}
			void move(String es){
				if(es.equals("E")){
					swap(0,2);
					swap(0,5);
					swap(0,3);
				}
				else if(es.equals("N")){
					if(nc == 4){
						this.move("E");
						ec = 0;
						
					}
					swap(4,5);
					swap(4,1);
					swap(4,0);
					nc++;
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
						else if(face[i]==faces[5-j] && face[5-i]==faces[j]){
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

		qube q = new qube();
		Integer j,k;
		
		for(j=0;j<q.n;j++){
			q.scn();

			for(k=0;;k++){
				if(q.b.equals(q.face[1])){
					break;
				}
				
				q.move("N");
				if(k.equals(3)){
					q.move("E");
				}
			}
			while(true){
				if(q.a.equals(q.face[0])){
					break;
				}
				q.move("E");
			}


			q.pt();
			q.face = q.faces.clone();
		}
		
		if(q.comp() == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

}

