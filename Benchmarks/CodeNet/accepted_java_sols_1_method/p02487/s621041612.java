import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		while(true){
			int tate = n.nextInt();
			int yoko = n.nextInt();
			if(yoko==0&&tate==0)break;
			for(int k=0;k<tate;k++){
				for(int i=0;i<yoko;i++){
					if(k==0||k==tate-1||i==0||i==yoko-1){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}