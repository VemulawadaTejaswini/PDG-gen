//Volume5-0582
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		final int   H      = 2,
			        X      = 0,
			        Y      = 1,
			        RIGHT  = 0,
			        ACUTE  = 1,
			        OBTUSE = 2;
		      int[] side   = new int[3];
		      int[] kind   = new int[3];

		while(true){
			side[0]=sc.nextInt(); side[1]=sc.nextInt(); side[2]=sc.nextInt();
			Arrays.sort(side);
			if(side[X]+side[Y] <= side[H]){break;}
			if(Math.pow(side[H],2) == Math.pow(side[X], 2)+Math.pow(side[Y], 2)){
				kind[RIGHT]++;
			} else if (Math.pow(side[H],2) < Math.pow(side[X], 2)+Math.pow(side[Y], 2)){
				kind[ACUTE]++;
			} else {
				kind[OBTUSE]++;
			}
		}
		int triangle = kind[RIGHT]+kind[ACUTE]+kind[OBTUSE];
		System.out.println(triangle+" "+kind[RIGHT]+" "+kind[ACUTE]+" "+kind[OBTUSE]);
	}
}