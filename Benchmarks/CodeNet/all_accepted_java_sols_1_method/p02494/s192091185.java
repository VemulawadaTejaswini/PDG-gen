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
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}	
	}
}