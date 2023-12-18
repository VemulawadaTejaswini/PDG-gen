import java.util.*;

public class Main {
public static int M;
public static int N;
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
        M= scan.nextInt();
        N= scan.nextInt();
        if((M |N )== 0)break;
        scan.nextLine();
        
        char [][] map = new char[M][N];
        for(int i=0;i<M;i++){
        	String line = scan.nextLine();
        	for(int j=0;j<N;j++){
        		map[i][j] = line.charAt(j);
        	}
        }
        int i=0;
        int j=0;
        int count =1;
        boolean flag =true;
        while(flag){
        		switch(map[i][j]){
        		case '>':
        			map[i][j++] = '*';
        			break;
        		case '<':
        			map[i][j--] = '*';
        			break;
        		case '^':
        			map[i--][j] = '*';
        			break;
        		case 'v':
        			map[i++][j] = '*';
        			break;
        		case '.':
        			System.out.println(j+" "+i);
        			flag = false;
        			break;
        		case '*':
        			System.out.println("LOOP");
        			flag =false ;
        			break;
        		}
        	}
        }
    }
}