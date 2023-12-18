import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int h =1;
		int w = 1;
		while(h > 0 && w > 0){
		h = a.nextInt();
		w = a.nextInt();
		
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				if(i ==0 || i == (h-1) || j == 0 || j ==(w-1)){
				System.out.print("#");
				}else{
					System.out.print(".");
				}
				
			}
			if(h != 0 && w != 0)
			System.out.println();
		}
		if(h != 0 && w != 0)
		System.out.println();
	}
	}

}