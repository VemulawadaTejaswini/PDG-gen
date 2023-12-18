import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String comp[][] = new String[2][num];
        int taro=0;
        int hanako=0;

        for(int i=0; i< num; i++){
        	comp[0][i]= sc.next();
        	comp[1][i]= sc.next();
        }
        sc.close();
        for(int i=0; i< num; i++){
        	int ans = comp[0][i].compareTo(comp[1][i]);
        	if (ans == 0) {
        		taro += 1;
        		hanako += 1;
        	} else if (ans < 0) {
        		hanako += 3;
        	} else {
        		taro += 3;
        	}
        }
        System.out.printf("%d %d%n", taro, hanako);
    }
}
