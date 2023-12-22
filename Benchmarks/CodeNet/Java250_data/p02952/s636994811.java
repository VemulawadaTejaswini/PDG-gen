import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //char[] S = sc.next().toCharArray();
        int count=0;
        for(int i=1; i<N+1; i++){
            if(i<10){
                count++;
            }
            if(100<=i && i<1000){
                count++;
            }
            if(10000<=i && i<100000){
                count++;
            }
        }

          System.out.println(count);
        }
    }