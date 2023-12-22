import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //char[] S = sc.next().toCharArray();
        int count=0;
        int yakusuu=0;
        int n;
        for(int i=0; 2*i<N; i++){
            n = 2*i+1;
            for(int k=1; k<n+1; k++){
                if(n%k==0){
                    yakusuu++;
                }
            }
            if(yakusuu==8){
                count++;
                
            }
            yakusuu=0;

        }

          System.out.println(count);
        }
    }