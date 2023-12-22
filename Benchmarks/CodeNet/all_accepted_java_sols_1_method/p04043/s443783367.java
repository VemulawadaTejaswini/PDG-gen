import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] uta = new int[11];
	int[] iroha = new int[3];
	for(int i = 0; i < 3; i++){
	    iroha[i] = scan.nextInt();
	    uta[iroha[i]]++;
	}

	if(uta[5] == 2 && uta[7] == 1){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
    
