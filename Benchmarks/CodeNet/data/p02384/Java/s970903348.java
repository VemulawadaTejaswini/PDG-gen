import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[6];
        int[] dice2=new int[4];
		String W;

		for (int i = 0; i < dice.length; i++) {
			dice[i] = sc.nextInt();
		}
		int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int num=0;
            int up=sc.nextInt();
            int side=sc.nextInt();
            
            if(up==dice[0]){
                if(side==dice[1])num=3;
                else if(side==dice[2])num=5;
                else if(side==dice[4])num=4;
                else if(side==dice[3])num=2;
                
        	}else if(up==dice[1]){
                if(side==dice[0])num=4;
                else if(side==dice[3])num=6;
                else if(side==dice[5])num=3;
                else if(side==dice[2])num=1;
                
        	}else if(up==dice[2]){
                if(side==dice[0])num=2;
                else if(side==dice[1])num=6;
                else if(side==dice[5])num=5;
                else if(side==dice[4])num=1;
                
        	}else if(up==dice[3]){
                if(side==dice[0])num=5;
                else if(side==dice[4])num=6;
                else if(side==dice[5])num=2;
                else if(side==dice[1])num=1;
                
        	}else if(up==dice[4]){
                if(side==dice[0])num=3;
                else if(side==dice[2])num=6;
                else if(side==dice[5])num=4;
                else if(side==dice[3])num=1;
                
        	}else{
                if(side==dice[1])num=4;
                else if(side==dice[3])num=5;
                else if(side==dice[4])num=3;
                else if(side==dice[2])num=2;
        	}
            System.out.println(dice[num-1]);
        }
        

		//Dice_1(W, dice);
        
		sc.close();
	}

	public static void Dice_1(String W, int[] dice) {
		String[] w = W.split("");
		for (int i = 0; i < w.length; i++) {
			if (w[i].equals("S")) {
				int num = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = dice[0];
				dice[0] = num;
			} else if (w[i].equals("W")) {
				int num = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = dice[0];
				dice[0] = num;
			} else if (w[i].equals("N")) {
				int num = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = dice[0];
				dice[0] = num;

			} else if (w[i].equals("E")) {
				int num = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = dice[0];
				dice[0] = num;

			}
		}
	}
}

