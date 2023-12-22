import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[] diameter;
        int step = 0;
        int massdia = 0;
		
        int cnt = sc.nextInt();
        diameter = new int[cnt];
        
        for(int i = 0; i < cnt; i++){
            diameter[i] = sc.nextInt();
        }
        
        int[] sort;
        sort = Arrays.stream(diameter).distinct().toArray();
        
        
        System.out.println(sort.length);
	}
}