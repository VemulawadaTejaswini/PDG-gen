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
		if(q.comp() == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

}
