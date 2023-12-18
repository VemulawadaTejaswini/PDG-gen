import java.util.Arrays;
import java.util.Scanner;

class Cube{
    int[] f;
    Cube(int[] Dice){
        f = new int[6];
        for(int i=0;i<6;i++){
            f[i] = Dice[i];
        }
    }
    
    void roll_z(){
        roll(1,2,4,3);
    }
    void roll_y(){
        roll(0,2,5,3);
    }
    void roll_x(){
        roll(0,1,5,4);
    }
    void roll(int i,int j,int k,int l){
        int t = f[i];
        f[i] = f[j];
        f[j] = f[k];
        f[k] = f[l];
        f[l] = t;
    } 
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] C = new int[6];
		for(int i=0;i<6;i++) 
			C[i] = sc.nextInt();
		
		Cube Alfa = new Cube(C);
		
		for(int i=0;i<6;i++) 
			C[i] = sc.nextInt();
		
		Cube Beta = new Cube(C);
		
		boolean Flag = false;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k = 0;k<4;k++) {
					if(Arrays.equals(Alfa.f,Beta.f)) {
						Flag = true;
						break;
					}
					Beta.roll_x();
				}
				Beta.roll_z();
			}
			Beta.roll_y();
		}
		if(Flag) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
