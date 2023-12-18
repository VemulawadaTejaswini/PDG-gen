import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int N = scan.nextInt();
            int[] S = new int[N];
            for(int i = 0; i < N;i++)
                S[i] = scan.nextInt();
            
            int Q = scan.nextInt();
            int[] T = new int[Q];
            for(int i = 0; i < Q; i++)
                T[i] = scan.nextInt();
            
            int count = 0;
            for(int i = 0;i < Q;i++){
                for(int j = 0;j < N;j++){
                    if(T[i] == S[j]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
        scan.close();
       
    }
}

